package com.qf.springmybatis.hanlder;

import com.qf.springmybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author H---J
 * @Date 2019/7/30
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean<String> handleException(Exception exception){
    exception.printStackTrace();

    return new ResultBean("404","您的操作错误，请稍后再试！");
    }
}
