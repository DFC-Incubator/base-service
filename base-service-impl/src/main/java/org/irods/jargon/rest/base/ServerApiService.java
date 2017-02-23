package org.irods.jargon.rest.base;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.pub.EnvironmentalInfoAO;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.rest.base.model.Ping;
import org.irods.jargon.rest.exception.IrodsRestException;
import org.irods.jargon.rest.security.IrodsAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
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
			throws IrodsRestException {

		log.info("server()");
		if (midTierOnly == null) {
			midTierOnly = false;
		}

		if (securityContext == null) {
			throw new IllegalArgumentException("null securityContext");
		}

		log.info("authentication:{}", SecurityContextHolder.getContext()
				.getAuthentication());
		IrodsAuthentication irodsAuthentication = (IrodsAuthentication) SecurityContextHolder
				.getContext().getAuthentication();

		float millis = 0.0f;
		if (!midTierOnly) {
			log.info("doing a ping!");
			log.info("authentication:{}", securityContext.getUserPrincipal());
			long startTime = System.currentTimeMillis();
			log.info("startTime:{}", startTime);
			try {
				log.info("accessing irods");
				EnvironmentalInfoAO environmentalInfoAO = irodsAccessObjectFactory
						.getEnvironmentalInfoAO(irodsAuthentication
								.getIrodsAccount());
				environmentalInfoAO.getIRODSServerCurrentTime();
				log.info("got properties");
			} catch (JargonException e) {
				log.error("Error pinging back end irods server", e);
				throw new IrodsRestException(e);
			}
			long endTime = System.currentTimeMillis();
			millis = endTime - startTime;
			log.info("endTime:{}", endTime);

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
