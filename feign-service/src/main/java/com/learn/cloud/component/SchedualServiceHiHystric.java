package com.learn.cloud.component;

import com.learn.cloud.client.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 王帅
 * @version v1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry to" + name;
    }

    @Override
    public String getHello() {
        return "sorry ";
    }
}
