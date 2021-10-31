package com.epoch.delegate.request;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * Override spring @RequestMapping.
 * RequestMapping Plus.
 * add some auth method.
 * <p>
 * Why it's call Requesting?
 * No why
 *
 * @author zhuyu
 * @since Create in 2021-10-31
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping
public @interface RequestingMapping {

    /**
     * method code (Used to verify method permissions，insure method only)
     */
    String code() default "";

    /**
     * almost ditto
     */
    String name() default "";

    /**
     * need login?
     */
    boolean requiredLogin() default true;

    /**
     * need permission?
     */
    boolean requiredPermission() default true;

    /**
     * override
     */
    @AliasFor(annotation = RequestMapping.class)
    String[] path() default {};

    /**
     * override
     */
    @AliasFor(annotation = RequestMapping.class)
    RequestMethod[] method() default RequestMethod.GET;

}
