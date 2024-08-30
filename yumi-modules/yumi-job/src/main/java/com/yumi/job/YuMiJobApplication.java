package com.yumi.job;

import com.yumi.common.security.annotation.EnableCustomConfig;
import com.yumi.common.security.annotation.EnableRyFeignClients;
import com.yumi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 定时任务
 *
 * @author yumi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class YuMiJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuMiJobApplication.class, args);
        System.out.println("(*^▽^*)  定时任务模块启动成功   (〃'▽'〃))  \n" +
                "\n" +
                "                          _ \n" +
                " _   _  _   _  _ __ ___  (_)\n" +
                "| | | || | | || '_ ` _ \\ | |\n" +
                "| |_| || |_| || | | | | || |\n" +
                " \\__, | \\__,_||_| |_| |_||_|\n" +
                " |___/                      \n");
    }
}
