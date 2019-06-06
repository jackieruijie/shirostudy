package com.jackie.myapp.service.impl;

import com.jackie.myapp.mapper.SysUserMapper;
import com.jackie.myapp.model.SysUser;
import com.jackie.myapp.service.SysUserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper userMapper;


    @Override
    public int registerNewUser(SysUser user) {
        SysUser existUser=userMapper.getUserByUsername(user.getUserName());
        //若用户已存在，则重新注册用户名
        if (existUser!=null){
            return 0;
        }
        Object salt=UUID.randomUUID().toString().replace("-","");//生成盐值
        user.setUserId(UUID.randomUUID().toString().replace("-",""));//生成userId
        user.setSalt(salt.toString());
        //密码加密 ；参数列表(加密方式，密码原值，盐值，加密次数)
        Object result = new SimpleHash("MD5",user.getPassword(),user.getSalt(),1024);
        System.out.println(result);
        user.setPassword(result.toString());//加密之后的密码
        return userMapper.insertSelective(user);
    }
}
