package com.qf.springmybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author H---J
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("log")
public class Logcontroller {

    private Logger logger= LoggerFactory.getLogger(Logcontroller.class);

    @RequestMapping("out")
    public String  out(){
        logger.debug("debug...................");
        logger.info("info......................");
        logger.warn("warn..........................");
        logger.error("error...........................");
        return "ok";
    }
}
