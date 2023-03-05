package co.jp.cloudbyte.StudentManagement.controller.user;

import co.jp.cloudbyte.StudentManagement.entity.UserInfo;
import co.jp.cloudbyte.StudentManagement.service.SearchService.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping("/userSearch")
    public String initUserList(Model model){
        List<UserInfo> userInfoList = searchService.searchALl();
        model.addAttribute("userInfoList", userInfoList);
        return "user/search";
    }

    @RequestMapping("/searchByCondition")
    public String searchUserList(Model model, @RequestParam("country") String country, @RequestParam("gender") String gender){
        List<UserInfo> userInfoList = searchService.searchByCondition(country,gender);
        model.addAttribute("userInfoList", userInfoList);
        return "user/search";
    }

}