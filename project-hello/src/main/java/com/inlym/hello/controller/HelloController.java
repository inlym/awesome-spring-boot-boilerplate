package com.inlym.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称
 *
 * <h2>说明
 * <p>说明文本内容
 *
 * @author <a href="https://www.inlym.com">inlym</a>
 * @since 1.0.0(2025 / 8 / 11)
 **/
@RestController
public class HelloController {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
