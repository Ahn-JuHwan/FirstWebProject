package com.example.webproject.Controller;

import com.example.webproject.Dao.UserDAO;
import com.example.webproject.Dto.SignupDTO;
import com.example.webproject.Service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public UserDAO signupUser(@RequestBody SignupDTO signupDTO){
        return userService.signUp(signupDTO);
    }

}
