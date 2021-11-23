package com.example.mybaitsspringboot.Controller;

import com.example.mybaitsspringboot.Dao.UserDao;
import com.example.mybaitsspringboot.Service.UserServiceImpl;
import com.example.mybaitsspringboot.Untils.RandomValidateCodeUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: MA
 * @Date: 2021/11/17 14:46
 *
 * 处理登录的控制器
 */
@RestController
public class LoginController {
    @Autowired(required = false)
    private UserDao userDao;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/CheckUserRepeat")
    public String CheckUserRepeat(@Param(value = "name") String uName) {
        //后续考虑到该项目作为管理系统 不该由用户自行注册 应由管理员分配账号设置权限
        //因此这里暂时搁置
        //这里不做session以及Shiro安全框架的验证,因为这里只单纯比较是否用户名已存在
        if (userDao.selectByName(uName) != null) {
            return "用户名重复";
        } else {
            return "用户名可用";
        }
    }

    /**
     * 验证码
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        try {
            //设置相应类型,告诉浏览器输出的内容为图片
            response.setContentType("image/jpeg");
            //设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
            //输出验证码图片方法
            randomValidateCode.getRandcode(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/login")
    public int Login(String name,
                     String pwd,
                     String check,
                     HttpSession session) {
        if (!userServiceImpl.checkVerify(check, session)) {
            System.out.println("验证码错误");
            return 5;
        }


        //获取用户输入的用户名密码 生成token命令
        UsernamePasswordToken token = new UsernamePasswordToken(name, pwd);

        //获取主体
        Subject subject = SecurityUtils.getSubject();
        try {
            //进行登入(提交认证)
            subject.login(token);

            System.out.println("用户认证的状态：isAuthenticated=" + subject.isAuthenticated());
            /*当用户登录成功时,会将当前用户名存入session对象*/
            session.setAttribute("user", name);
            return 4;
        } catch (IncorrectCredentialsException exception) {
            System.out.println("用户名密码不匹配");
            return 2;
        } catch (LockedAccountException exception) {
            System.out.println("账号已被锁定");
            return 3;
        } catch (DisabledAccountException exception) {
            System.out.println("账号已被禁用");
            return 3;
        } catch (UnknownAccountException exception) {
            System.out.println("用户不存在");
            return 1;
        }


    }
    /*
    用户通过登录进到首页时会向这里发起请求 这个请求通过获取session对象
    用于返回当前登录的用户名
    */
    @RequestMapping("/welcomeName/select")
    public String welcomeName(HttpSession session ){
        System.out.println((String) session.getAttribute("user"));
        return  (String) session.getAttribute("user");
    }

}
