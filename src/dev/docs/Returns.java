package dev.docs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.2
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Returns {

    Class<?> value();

    String what() default "Not specified";

}
