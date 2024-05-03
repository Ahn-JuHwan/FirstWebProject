package com.example.webproject.Controller;

import com.example.webproject.Dto.UserDTO;
import com.example.webproject.Service.UserService;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/sign")
    public String sign() {
        return "sign";
    }

    @PostMapping("/sign")
    public String addUser(@ModelAttribute UserDTO userDTO) {

        userService.save(userDTO);


        return "login"; // 성공 시 리다이렉트될 페이지
    }
    @GetMapping("login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String logUser(@ModelAttribute UserDTO userDTO, HttpSession session){
        UserDTO loginResult = userService.login(userDTO);
        if(loginResult != null){
            session.setAttribute("userName", loginResult.getUserName());
            return "main";
        }
        else{
            return "login";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 삭제
        return "login"; // 로그아웃 후 로그인 페이지로 이동
    }

}

