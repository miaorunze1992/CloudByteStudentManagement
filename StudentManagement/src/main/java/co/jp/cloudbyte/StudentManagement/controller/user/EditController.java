package co.jp.cloudbyte.StudentManagement.controller.user;


import co.jp.cloudbyte.StudentManagement.entity.UserInfo;
import co.jp.cloudbyte.StudentManagement.form.RegisterForm;
import co.jp.cloudbyte.StudentManagement.service.EditService.EditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EditController {

    @Autowired
    EditService editService;

    @RequestMapping("/userInitEdit")
    public String userInitEdit(Model model, @RequestParam("username") String username) {
        UserInfo userInfo = editService.editInit(username);
        model.addAttribute("userInfo", userInfo);
        return "/user/edit";
    }

    @RequestMapping("/userEdit")
    public String userInitEdit(Model model, RegisterForm registerForm) {
        try {
            editService.userEdit(registerForm);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("errorMsg", "更新失败,请检查注册信息！");
            return "user/edit";
        }
        return "redirect:userSearch";
    }

    @RequestMapping("/userDelete")
    public String userInitEdit(@RequestParam("username") String username) {
        editService.deleteUser(username);
        return "redirect:userSearch";
    }

    @RequestMapping("/deleteChecked")
    public String deleteChecked(Model model, @RequestParam("nameArr") String nameArr) {
        String[] names = nameArr.split(",");


        for (String username : names) {

            try {
                editService.deleteUser(username);
            }catch (Exception e){
                e.printStackTrace();
                model.addAttribute("errorMsg","删除失败,请检查注册信息！");
                break;
            }
        }
        return "redirect:userSearch";
    }

}
