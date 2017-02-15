package org.irods.jargon.rest.base;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.rest.base.model.Ping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServerApiService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IRODSAccessObjectFactory irodsAccessObjectFactory;

	/**
	 * Send back a heartbeat ping
	 * 
	 * @param midTierOnly
	 *            <code>boolean</code>. If <code>true</code>, don't ping iRODS,
	 *            if <code>false</code>, iRODS is pinged and the round trip time
	 *            is returned
	 * @param securityContext
	 * @return {@link Response}
	 * @throws NotFoundException
	 */
	public Response server(Boolean midTierOnly, SecurityContext securityContext)
			throws NotFoundException {

		log.info("server()");
		if (midTierOnly == null) {
			midTierOnly = false;
		}

		if (securityContext == null) {
			throw new IllegalArgumentException("null securityContext");
		}

		log.info("securityContext:{}", securityContext);

		float millis = 0.0f;
		if (!midTierOnly) {

		}

		log.info("principal:{}", securityContext.getUserPrincipal());

		Ping ping = new Ping();
		ping.setPingTime(millis);

		return Response.status(200).entity(ping).build();

	}

	/**
	 * @return the irodsAccessObjectFactory
	 */
	public IRODSAccessObjectFactory getIrodsAccessObjectFactory() {
		return irodsAccessObjectFactory;
	}

	/**
	 * @param irodsAccessObjectFactory
	 *            the irodsAccessObjectFactory to set
	 */
	public void setIrodsAccessObjectFactory(
			IRODSAccessObjectFactory irodsAccessObjectFactory) {
		this.irodsAccessObjectFactory = irodsAccessObjectFactory;
	}
}
