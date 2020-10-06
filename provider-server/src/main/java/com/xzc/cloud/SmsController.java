package com.xzc.cloud;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ray
 * @date created in 2020/10/6 15:51
 */
@RestController
public class SmsController {

    @PostMapping("/sms/send")
    public Object send(@RequestParam String phoneNum,
                       @RequestParam String content) {
        System.out.printf("给%s发送消息：%s\n", phoneNum, content);
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "发送成功");
        return result;
    }
}
