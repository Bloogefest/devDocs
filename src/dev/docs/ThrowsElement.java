package dev.docs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({})
public @interface ThrowsElement {

    Class<? extends Throwable> value();

    String why() default "Not specified";

}
