package com.qf.springmybatis.controller;

import com.qf.springmybatis.entity.TUs;
import com.qf.springmybatis.service.Iuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author H---J
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("/user")
public class Usercontroller {

    @Autowired
    private Iuserservice userservice;

    public  void test(){}

    @RequestMapping("/getById/{id}")
    public TUs gstById(@PathVariable("id") Integer id){
        System.out.println(id);
        return userservice.gstById(id);

    }
}
