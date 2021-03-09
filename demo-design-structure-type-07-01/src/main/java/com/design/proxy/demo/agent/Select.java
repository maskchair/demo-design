package com.design.proxy.demo.agent;

import java.lang.annotation.*;

/**
 * @author Jack House
 * @date 2021年03月09日 16:00:48
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    String value() default "";

}
