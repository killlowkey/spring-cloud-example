package com.xzc.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Ray
 * @date created in 2020/10/6 15:58
 */
@FeignClient("PROVIDER-SERVER")
public interface SmsService {

    @PostMapping("/sms/send")
    Object send(@RequestParam String phoneNum,
                @RequestParam String content);
}
