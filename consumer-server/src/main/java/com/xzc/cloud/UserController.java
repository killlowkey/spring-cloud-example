package com.xzc.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ray
 * @date created in 2020/10/6 16:00
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/sysuser/pwd/reset")
    public Object resetPwd(@RequestParam long id) {
        userService.resetPassword("dsgvfjvdjkf");
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "密码重置成功");
        return result;
    }
}
