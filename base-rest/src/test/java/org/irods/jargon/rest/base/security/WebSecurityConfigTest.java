package org.irods.jargon.rest.base.security;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@ContextConfiguration("classpath:/test-rest-servlet.xml")
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class WebSecurityConfigTest {

	@Autowired
	private WebApplicationContext wac;
	@Autowired
	private WebSecurityConfig webSecurityConfig;

	/**
	 * Tests general spring wiring to bring in web security config spring assets
	 */
	@Test
	public void testConfigureHttpSecurity() {
		Assert.assertNotNull("webSecurityConfig not provisioned",
				webSecurityConfig);
	}

	/**
	 * Tests general spring wiring to bring in web security config spring assets
	 */
	@Test
	public void testAuthenticate() {

	}

	/**
	 * @return the webSecurityConfig
	 */
	public WebSecurityConfig getWebSecurityConfig() {
		return webSecurityConfig;
	}

	/**
	 * @param webSecurityConfig
	 *            the webSecurityConfig to set
	 */
	public void setWebSecurityConfig(WebSecurityConfig webSecurityConfig) {
		this.webSecurityConfig = webSecurityConfig;
	}

	/**
	 * @return the wac
	 */
	public WebApplicationContext getWac() {
		return wac;
	}

	/**
	 * @param wac
	 *            the wac to set
	 */
	public void setWac(WebApplicationContext wac) {
		this.wac = wac;
	}

}
