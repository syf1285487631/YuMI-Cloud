package com.yumi.file;

import com.yumi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 文件服务
 * 
 * @author yumi
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class YuMiFileApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YuMiFileApplication.class, args);
        System.out.println("(*^▽^*)  文件服务模块启动成功   (〃'▽'〃))  \n" +
                "\n" +
                "                          _ \n" +
                " _   _  _   _  _ __ ___  (_)\n" +
                "| | | || | | || '_ ` _ \\ | |\n" +
                "| |_| || |_| || | | | | || |\n" +
                " \\__, | \\__,_||_| |_| |_||_|\n" +
                " |___/                      \n");
    }
}
