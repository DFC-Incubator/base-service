/**
 * 
 */
package org.irods.jargon.spring.enable;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

@Retention(RUNTIME)
@Target(TYPE)
@Import(IrodsJargonConfiguration.class)
/**
 * Base Spring wiring for jargon beans
 * 
 * @author mconway
 *
 */
public @interface EnableIrods {

}
