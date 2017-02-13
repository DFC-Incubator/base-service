package org.irods.jargon.rest.security;

import org.irods.jargon.core.connection.AuthScheme;
import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.connection.IRODSSession;
import org.irods.jargon.core.connection.auth.AuthResponse;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.rest.configuration.RestConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public class IrodsAuthenticationProviderTest {

	@Test
	public void testAuthenticate() throws Exception {

		String user = "test";
		String password = "test";
		Authentication auth = new UsernamePasswordAuthenticationToken(user,
				password);

		IRODSAccount irodsAccount = IRODSAccount.instance("host", 1247, "test",
				"test", "", "zone", "", AuthScheme.STANDARD);
		AuthResponse authResponse = new AuthResponse();
		authResponse.setSuccessful(true);
		authResponse.setAuthenticatedIRODSAccount(irodsAccount);
		authResponse.setAuthenticatedIRODSAccount(irodsAccount);

		IRODSAccessObjectFactory iaf = Mockito
				.mock(IRODSAccessObjectFactory.class);

		Mockito.when(iaf.authenticateIRODSAccount(irodsAccount)).thenReturn(
				authResponse);

		IRODSSession sessionMock = Mockito.mock(IRODSSession.class);

		RestConfiguration config = new RestConfiguration();
		config.setIrodsHost("host");
		config.setIrodsPort(1247);
		config.setIrodsZone("zone");

		IrodsAuthenticationProvider irodsAuthenticationProvider = new IrodsAuthenticationProvider();
		irodsAuthenticationProvider.setIrodsAccessObjectFactory(iaf);
		irodsAuthenticationProvider.setIrodsSession(sessionMock);
		irodsAuthenticationProvider.setRestConfiguration(config);
		Authentication actual = irodsAuthenticationProvider.authenticate(auth);
		Assert.assertNotNull("no auth returned", actual);
		Assert.assertTrue("not authorized", actual.isAuthenticated());
		Assert.assertNotNull("no user", actual.getPrincipal());

	}
}
