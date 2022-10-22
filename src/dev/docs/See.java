package dev.docs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface See {

    String value() default "Not specified";


}
