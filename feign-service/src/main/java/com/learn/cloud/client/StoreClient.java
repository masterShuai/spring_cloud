package com.learn.cloud.client;

import com.learn.cloud.config.FoodConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author 王帅
 * @version v1.0
 */
@FeignClient(name = "stores", configuration = FoodConfiguration.class)
public interface StoreClient {
    //..
}
