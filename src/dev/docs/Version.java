package dev.docs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {

    String value() default "Not specified";

}
