package com.yumi.auth;

import com.yumi.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 认证授权中心
 *
 * @author yumi
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class YuMiAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuMiAuthApplication.class, args);
        System.out.println("(*^▽^*)  认证授权中心启动成功  (〃'▽'〃) \n" +
                "\n" +
                "                          _ \n" +
                " _   _  _   _  _ __ ___  (_)\n" +
                "| | | || | | || '_ ` _ \\ | |\n" +
                "| |_| || |_| || | | | | || |\n" +
                " \\__, | \\__,_||_| |_| |_||_|\n" +
                " |___/                      \n");
    }
}
