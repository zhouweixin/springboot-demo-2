package com.zhou.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/add")
    public String save(User user){
        return "添加一条数据成功: " + userService.save(user);
    }

    @GetMapping(value = "/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping(value = "/findByName")
    public User findByName(String name){
        return userService.findByName(name);
    }
}
