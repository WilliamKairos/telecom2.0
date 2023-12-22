package com.telecommunications.controller;


import com.telecommunications.pojo.admin.User;
import com.telecommunications.service.UserService;
import com.telecommunications.utils.JwtUtil;
import com.telecommunications.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<Result> login(@RequestBody Map<String , String> requestData) {
        String username = requestData.get("username");
        String password = requestData.get("password");
        User user = userService.findUser(username, password);
        System.out.println(user);
        if (user == null) {
            return new ResponseEntity<>(new Result(401, "登录失败，用户名或密码不正确", null), HttpStatus.UNAUTHORIZED);
        } else {
            user.setToken(JwtUtil.createToken());
            System.out.println(user);
            return new ResponseEntity<>(new Result(200, "登录成功!", user), HttpStatus.OK);
        }
    }

    @GetMapping("/find")
    public ResponseEntity<Result> find(User user){
        User findUser = userService.findUserByName(user);
        if (user == null) {
            return new ResponseEntity<>(new Result(401, "获取失败，不存在数据！", null), HttpStatus.UNAUTHORIZED);
        } else {
            return new ResponseEntity<>(new Result(200, "查询成功！", findUser), HttpStatus.OK);

        }
    }

    @GetMapping("/get_all")
    public ResponseEntity<Result> getAll(){
        List<User> userList = userService.getAll();
        if (userList == null) {
            return new ResponseEntity<>(new Result(401, "获取失败，不存在数据！", null), HttpStatus.UNAUTHORIZED);
        } else {
            return new ResponseEntity<>(new Result(200, "查询成功！", userList), HttpStatus.OK);

        }
    }

    @PostMapping("/add")
    public ResponseEntity<Result> add(@RequestBody User user){
        int flag = userService.add(user);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "加入失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "加入成功", user), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Result> delete(@RequestBody User user){
        int flag = userService.delete(user);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "删除失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "删除成功", null), HttpStatus.OK);
        }
    };

    @PutMapping("/update")
    public ResponseEntity<Result> update(@RequestBody User user){
        int flag = userService.update(user);
        if (flag == -1){
            return new ResponseEntity<>(new Result(400, "出现错误！", null), HttpStatus.BAD_REQUEST);
        }else if (flag == 0){
            return new ResponseEntity<>(new Result(401, "更新失败, 请重新检查数据", null), HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(new Result(200, "更新成功", user), HttpStatus.OK);
        }
    };

}
