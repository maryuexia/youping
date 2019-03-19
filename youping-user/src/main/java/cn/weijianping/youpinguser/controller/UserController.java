package cn.weijianping.youpinguser.controller;

import cn.weijianping.youpinguser.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/get_info/{id}")
    public User getInfo(@PathVariable("id") String id){

        return  User.builder()
                .id(id)
                .email("yuexia@weijianping.cn")
                .name("月下")
                .password("123456")
                .password("88888888")
                .build();
    }
}
