package com.example.webproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final UserController userController;

    private final PostController postController;
    // 생성자 주입을 사용하여 UserController를 HomeController에 주입합니다.
    public HomeController(UserController userController, PostController postController) {
        this.userController = userController;
        this.postController = postController;
    }
    @GetMapping("/")
    public String homeForm(){
        return "main";
    }
    @GetMapping("/login-up")
    public String loginForm() {
        return userController.login(); // 로그인 폼의 뷰 이름을 반환
    }

    @GetMapping("/sign-up")
    public String signUpForm() {
        return userController.sign(); // 회원가입 폼의 뷰 이름을 반환
    }

    @GetMapping("/post-up")
    public String postUpForm() {
        return postController.post(); // 회원가입 폼의 뷰 이름을 반환
    }


}
