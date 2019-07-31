package com.qf.springmybatis.controller;

import com.qf.springmybatis.entity.TUs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author H---J
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("page")
public class Pagecontroller {

    @RequestMapping("hello")
    public String hello(Model model){

     /*   //制作异常
        int i=1/0;*/

        //替换
    String name="胡歌";
    model.addAttribute("uname",name);


        //存入对象前台获取属性
        TUs us=new TUs(1,"zs","123");
        model.addAttribute("us",us);

        //判断后输出
        model.addAttribute("menony",100000);


        //存入集合到前台获取遍历
        List<TUs>  uslist=new ArrayList<>();
        uslist.add(new TUs(2,"aa","145"));
        uslist.add(new TUs(3,"bb","139"));
        model.addAttribute("uslist",uslist);



//        存入日期格式
        model.addAttribute("now",new Date());
        return "hello";
    }
}
