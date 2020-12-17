package com.taolyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by 陶Lyn
 * on 2020/11/23.
 */
@SpringBootApplication
//扫描mybatis通用mapper 所在的包
@MapperScan(basePackages = "com.taolyn.mapper")
// 扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com.taolyn", "org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
