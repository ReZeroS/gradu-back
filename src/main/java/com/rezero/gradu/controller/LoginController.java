package com.rezero.gradu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

//    @GetMapping("/index")
//    public String index(){ return "index"; }

//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }

//
//    @PostMapping("/login")
//    @ResponseBody
//    public ResponseBo login(String username, String password) {
//        // 密码MD5加密
//        password = MD5Utils.encrypt(username, password);
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//        // 获取Subject对象
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            subject.login(token);
//            return ResponseBo.ok();
//        } catch (UnknownAccountException e) {
//            return ResponseBo.error(e.getMessage());
//        } catch (IncorrectCredentialsException e) {
//            return ResponseBo.error(e.getMessage());
//        } catch (LockedAccountException e) {
//            return ResponseBo.error(e.getMessage());
//        } catch (AuthenticationException e) {
//            return ResponseBo.error("认证失败！");
//        }
//    }
//    @RequestMapping("/")
//    public String redirectIndex() {
//        return "redirect:/index";
//    }
//    @RequestMapping("/index")
//    public String index(Model model) {
//        // 登录成后，即可通过Subject获取登录的用户信息
//        User user = (User) SecurityUtils.getSubject().getPrincipal();
//        model.addAttribute("user", user);
//        return "index";
//    }
}
