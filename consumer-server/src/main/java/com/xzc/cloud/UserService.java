package com.xzc.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ray
 * @date created in 2020/10/6 16:00
 */
@Service
public class UserService {

    @Autowired
    private SmsService smsService;

    public void resetPassword(String newPassword) {
        smsService.send("123456789", "密码重置成功，已将密码重置为：" + newPassword);
        System.out.println("重置密码成功");
    }
}
