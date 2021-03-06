package com.xiaowuyaya.bstdormitorycms.controller;

import com.xiaowuyaya.bstdormitorycms.entity.User;
import com.xiaowuyaya.bstdormitorycms.service.UserRoleService;
import com.xiaowuyaya.bstdormitorycms.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRoleController {

    @Autowired
    UserRoleService userRoleService;

    @GetMapping("/adminGetUser")
    public ResponseResult adminGetUser(Integer page, Integer limit){
        return userRoleService.adminGetUser(page, limit);
    }

    @GetMapping("/getRolesList")
    public ResponseResult getRolesList(){
        return userRoleService.getRolesList();
    }

    @PostMapping("/addUser")
    public ResponseResult addUser(User user){
        return userRoleService.addUser(user);
    }

    @PostMapping("/updateUser")
    public ResponseResult updateUser(User user){
        return userRoleService.updateUser(user);
    }

    @PostMapping("/resetPassword")
    public ResponseResult resetPassword(User user){
        return userRoleService.resetPassword(user);
    }



}
