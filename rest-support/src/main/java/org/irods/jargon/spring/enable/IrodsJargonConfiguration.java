/**
 * 
 */
package org.irods.jargon.spring.enable;

import org.irods.jargon.core.connection.IRODSProtocolManager;
import org.irods.jargon.core.connection.IRODSSession;
import org.irods.jargon.core.connection.IRODSSimpleProtocolManager;
import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.exception.JargonRuntimeException;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.core.pub.IRODSAccessObjectFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring bean wiring supporting the {@link EnableIrods} annotation
 * 
 * @author mconway
 *
 */
@Configuration
public class IrodsJargonConfiguration {

	private Logger log = LoggerFactory.getLogger(IrodsJargonConfiguration.class);

	@Bean
	public IRODSSession irodsSession() {
		log.info("creating IRODSSession bean");
		try {
			return new IRODSSession(irodsConnectionManager());
		} catch (JargonException e) {
			log.error("exception initializing irodsSession", e);
			throw new JargonRuntimeException("error creating irodsSession", e);
		}
	}

	@Bean
	public IRODSProtocolManager irodsConnectionManager() {
		log.info("creating irodsConnectionManager bean");
		IRODSSimpleProtocolManager irodsSimpleProtocolManager = new IRODSSimpleProtocolManager();
		try {
			irodsSimpleProtocolManager.initialize();
		} catch (JargonException e) {
			log.error("exception initializing irodsConnectionManager", e);
			throw new JargonRuntimeException("error creating irodsConnectionManager", e);
		}
		return irodsSimpleProtocolManager;
	}

	@Bean
	public IRODSAccessObjectFactory irodsAccessObjectFactory() {
		log.info("creating irodsAccessObjectFactory bean");
		return new IRODSAccessObjectFactoryImpl(irodsSession());

	}

}
