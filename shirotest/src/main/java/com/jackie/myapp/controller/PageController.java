package com.jackie.myapp.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginPage(String username,String password){
        Subject subject= SecurityUtils.getSubject();
        if (!subject.isAuthenticated()){//如果当前用户未登录则进行登陆操作
            try {
                UsernamePasswordToken token = new UsernamePasswordToken(username,password);
                subject.login(token);
            }catch (UnknownAccountException e) {
                e.printStackTrace();
                System.out.println("用户名错误！");
            }catch (IncorrectCredentialsException e) {
                e.printStackTrace();
                System.out.println("密码错误！");
            } catch (AuthenticationException e) {
                e.printStackTrace();
                System.out.println("其他错误！");
            }
        }
            System.out.println("登陆跳转");
        return "redirect:main";
    }


    @RequestMapping("/logout")
    public String logout(){
        Subject currentUser = SecurityUtils.getSubject(); //拿到当前用户
        currentUser.logout();
        return "login";
    }

}
