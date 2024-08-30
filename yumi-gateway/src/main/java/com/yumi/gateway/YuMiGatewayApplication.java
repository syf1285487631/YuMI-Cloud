package com.yumi.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author yumi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class YuMiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuMiGatewayApplication.class, args);
        System.out.println("(*^▽^*)  羽觅网关启动成功   (〃'▽'〃))  \n" +
                "\n" +
                "                          _ \n" +
                " _   _  _   _  _ __ ___  (_)\n" +
                "| | | || | | || '_ ` _ \\ | |\n" +
                "| |_| || |_| || | | | | || |\n" +
                " \\__, | \\__,_||_| |_| |_||_|\n" +
                " |___/                      \n");
    }
}
