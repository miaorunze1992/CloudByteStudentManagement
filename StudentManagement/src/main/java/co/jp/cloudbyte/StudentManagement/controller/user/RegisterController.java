package co.jp.cloudbyte.StudentManagement.controller.user;

import co.jp.cloudbyte.StudentManagement.form.RegisterForm;
import co.jp.cloudbyte.StudentManagement.service.RegisterService.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/userRegister")
    public String userRegister(Model model, RegisterForm registerForm) {
        try {
            registerService.register(registerForm);
        }catch (Exception e){
            e.printStackTrace();
            model.addAttribute("errorMsg","注册失败,请检查注册信息！");
            return "user/register";
        }
            return "redirect:userSearch";
        }

}
