package com.epoch.actuator.Test;

import com.epoch.delegate.request.GetRequesting;
import com.epoch.delegate.request.RequestingMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhuyu
 * @since Create in 2021-10-31
 */
@Controller
@RequestingMapping(path = "/test")
public class TestController {

    @GetRequesting(name = "test", path = "/test")
    @ResponseBody
    public String hello() {
        return "success";
    }
}
