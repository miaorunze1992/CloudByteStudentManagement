package co.jp.cloudbyte.StudentManagement.controller;

import co.jp.cloudbyte.StudentManagement.entity.UserInfo;
import co.jp.cloudbyte.StudentManagement.service.EditService.EditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    EditService editService;

    @RequestMapping("/userLogin")
    public String login(Model model, @RequestParam("username") String username, @RequestParam("password") String password) {

        UserInfo userInfo = editService.editInit(username);

        if(userInfo == null){
            model.addAttribute("errorMsg","用户名不存在,请检查");
            return "index";
        }

        if(!Objects.equals(password, userInfo.getPassword())){
            model.addAttribute("errorMsg","密码不正确,请重新输入");
            return "index";
        }

        return "redirect:userSearch";

    }

    @RequestMapping("/login")
    public String login() {
        return "index";
    }

    @RequestMapping("/register")
    public String userRegister() {

        return "user/register";

    }

}
