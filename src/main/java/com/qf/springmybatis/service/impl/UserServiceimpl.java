package com.qf.springmybatis.service.impl;

import com.qf.springmybatis.entity.TUs;
import com.qf.springmybatis.mapper.TUsMapper;
import com.qf.springmybatis.service.Iuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author H---J
 * @Date 2019/7/29
 */
@Service
public class UserServiceimpl implements Iuserservice {

    @Autowired
    private TUsMapper usMapper;


    @Override
    public TUs gstById(Integer id) {
        return usMapper.selectByPrimaryKey(id);
    }
}
