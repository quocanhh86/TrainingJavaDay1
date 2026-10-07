package com.example.springbootmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HelloWorldController {

    private final MessageSource messageSource;
    @Value("${message}")
    private String message;
    @GetMapping()
    public String helloWorld(HttpServletRequest request) {
        request.setAttribute("msg", messageSource.getMessage("title.hello", null, null));
        request.setAttribute("msg1", message);
        return "index";
    }
}
