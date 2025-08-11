package com.inlym.web;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 类名称
 *
 * <h2>说明
 * <p>说明文本内容
 *
 * @author <a href="https://www.inlym.com">inlym</a>
 * @since 1.0.0
 **/
@SpringBootApplication(scanBasePackages = {"com.inlym.**"})
@ServletComponentScan(basePackages = {"com.inlym.**"})
@MapperScan(basePackages = {"com.inlym.**"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
