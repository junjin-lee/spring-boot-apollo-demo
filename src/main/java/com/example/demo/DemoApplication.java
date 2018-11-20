package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {
    @Autowired
    private JavaConfigSample javaConfigSample;


    /**
     * Java Config方式，JavaConfigSample内部使用了Config API，属性值的修改会立即生效
     * @return
     */

    @GetMapping("/javaconfig")
    public JavaConfigSample commonProperties(){
        return javaConfigSample;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
