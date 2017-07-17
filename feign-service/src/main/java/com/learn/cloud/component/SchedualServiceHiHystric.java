package com.learn.cloud.component;

import com.learn.cloud.client.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author 王帅
 * @version v1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String getHello() {
        return "sorry ";
    }
}
