package com.qf.springmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author H---J
 * @Date 2019/7/30
 */
//全局的异常处理类

@Data
@AllArgsConstructor
public class ResultBean <T>{

    private String respCode;    //响应应码（404、500。。。。。。。。。）
    private T data;             //响应的报错数据


}
