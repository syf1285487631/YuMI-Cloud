package com.yumi;

import com.yumi.common.security.annotation.EnableCustomConfig;
import com.yumi.common.security.annotation.EnableRyFeignClients;
import com.yumi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author yumi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class YuMIAIApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YuMIAIApplication.class, args);
        System.out.println("(*^▽^*)  AI模块启动成功  (〃'▽'〃) \n" +
                "\n" +
                "                          _ \n" +
                " _   _  _   _  _ __ ___  (_)\n" +
                "| | | || | | || '_ ` _ \\ | |\n" +
                "| |_| || |_| || | | | | || |\n" +
                " \\__, | \\__,_||_| |_| |_||_|\n" +
                " |___/                      \n");
    }
}