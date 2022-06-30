package user.controller;

import user.bean.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import user.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("addUser")
    public String addUser(UserInfo userInfo){
        userService.addUser(userInfo);
        return "success";
    }

    @GetMapping("allUsers")
    public List<UserInfo> allUsers(){
        return userService.allUsers();
    }
}
