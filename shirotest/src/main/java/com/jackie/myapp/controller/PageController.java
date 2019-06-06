package com.jackie.myapp.controller;

import com.jackie.myapp.model.SysUser;
import com.jackie.myapp.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class PageController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginPage(String username,String password){
        //获取当前登录用户
        Subject subject= SecurityUtils.getSubject();
        System.out.println("---------->user:"+username+"---------->pass:"+password);
        if (!subject.isAuthenticated()){//如果当前用户未登录则进行登陆操作
            try {
                UsernamePasswordToken token = new UsernamePasswordToken(username,password);
                token.setRememberMe(false);//记住我
                subject.login(token);
                return "index";
            }catch (UnknownAccountException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("用户名错误！");
                return "redirect:/userlogin";
            }catch (IncorrectCredentialsException e) {
                e.printStackTrace();
                System.out.println("密码错误！");
                System.out.println(e.getMessage());
            } catch (AuthenticationException e) {
                e.printStackTrace();
                System.out.println("其他错误！");
                System.out.println(e.getMessage());
            }
        }
            System.out.println("登陆跳转");
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(){
        Subject currentUser = SecurityUtils.getSubject(); //拿到当前用户
        currentUser.logout();
        return "login";
    }

    /**
     * 用户登录
     * @return 返回登录页面
     */
    @RequestMapping("/userlogin")
    public String userLogin(){
        return "login";
    }


    /**
     * 用户登录
     * @return 返回登录页面
     */
    @RequestMapping("/register")
    public String register(){
        System.out.println("现在开始注册页面的开始！！！！！");
        return "register";
    }


    /**
     * 用户登录
     * @return 返回登录页面
     */
    @RequestMapping(value = "/userRegister",method = RequestMethod.POST)
    public String userRegister(String username,String password,String fullname){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        System.out.println("fullname:"+fullname);
        System.out.println("开始注册！！！！！");
        SysUser user=new SysUser();
        user.setUserName(username);
        user.setPassword(password);
        user.setFullName(fullname);
        int res=sysUserService.registerNewUser(user);
        if (res>0){
            System.out.println("注册成功！！！！！");
            return "login";
        }else {
            System.out.println("注册失败！！！！！");
            return "register";
        }


    }


}
