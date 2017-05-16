/**
 *
 */
package org.irods.jargon.rest.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * Help obtaining security context for RESTful services using Spring Securit
 *
 * @author mconway
 *
 */
@Component
public class SecurityContextHelper {

	/**
	 * Get the irods authentication put into the security context via Spring
	 * Security
	 *
	 * @throws {@link
	 *             IllegalStateException} if no context was found
	 * @return {@link IrodsAuthentication}
	 */
	public IrodsAuthentication obtainIrodsAuthenticationFromContext() {
		IrodsAuthentication irodsAuthentication = (IrodsAuthentication) SecurityContextHolder.getContext()
				.getAuthentication();
		if (irodsAuthentication == null) {
			throw new IllegalStateException("cannot find security context");
		}
		return irodsAuthentication;
	}

}
