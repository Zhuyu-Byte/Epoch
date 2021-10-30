package com.epoch.actuator.Test;

import com.epoch.delegate.request.GetRequesting;
import org.springframework.stereotype.Controller;

/**
 * @author zhuyu
 * @since Create in 2021-10-31
 */
@Controller
public class TestController {

    @GetRequesting(name = "asd")
    public void hello() {

    }
}
