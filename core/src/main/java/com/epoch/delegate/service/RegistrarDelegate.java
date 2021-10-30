package com.epoch.delegate.service;

import com.epoch.fixed.enums.RegistrarEnum;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface RegistrarDelegate {

    /**
     * just override spring component
     */
    @AliasFor(annotation = Component.class)
    String value() default "";

    /**
     * what this class do
     */
    RegistrarEnum function() default RegistrarEnum.defaults;
}
