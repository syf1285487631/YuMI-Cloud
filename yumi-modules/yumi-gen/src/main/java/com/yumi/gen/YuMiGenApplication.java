package com.yumi.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.yumi.common.security.annotation.EnableCustomConfig;
import com.yumi.common.security.annotation.EnableRyFeignClients;
import com.yumi.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author yumi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class YuMiGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YuMiGenApplication.class, args);
        System.out.println("(*^▽^*)  代码生成模块启动成功   (〃'▽'〃))  \n" +
                "\n" +
                "                          _ \n" +
                " _   _  _   _  _ __ ___  (_)\n" +
                "| | | || | | || '_ ` _ \\ | |\n" +
                "| |_| || |_| || | | | | || |\n" +
                " \\__, | \\__,_||_| |_| |_||_|\n" +
                " |___/                      \n");
    }
}
