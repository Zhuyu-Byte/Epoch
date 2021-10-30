package com.epoch.delegate.request;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * @author zhuyu
 * @see RequestingMapping
 * @since Create in 2021-10-31
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestingMapping(method = RequestMethod.GET)
public @interface GetRequesting {

    /**
     * override
     */
    @AliasFor(annotation = RequestingMapping.class)
    String code() default "";

    /**
     * override
     */
    @AliasFor(annotation = RequestingMapping.class)
    String name() default "";

    /**
     * override
     */
    @AliasFor(annotation = RequestingMapping.class)
    boolean requiredLogin() default true;

    /**
     * override
     */
    @AliasFor(annotation = RequestingMapping.class)
    boolean requiredPermission() default true;

    /**
     * override
     */
    @AliasFor(annotation = RequestingMapping.class)
    String[] path() default {};

    /**
     * override
     */
    @AliasFor(annotation = RequestingMapping.class)
    RequestMethod[] method() default RequestMethod.GET;
}
