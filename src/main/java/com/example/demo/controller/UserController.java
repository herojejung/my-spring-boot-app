package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // アプリケーションのルートURLへのアクセスを/registerにリダイレクト
    @GetMapping("/")
    public String rootRedirect() {
        return "redirect:/register";
    }

    // 登録フォームの表示
    @PostMapping("/register")
    public String registerUser(User user) {
        String encodedPassword = passwordEncoder().encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "redirect:/register";
    }

    // ユーザーの登録処理
    @PostMapping("/register")
    public String registerUser(User user) {
        userRepository.save(user);
        return "redirect:/register";
    }
}
