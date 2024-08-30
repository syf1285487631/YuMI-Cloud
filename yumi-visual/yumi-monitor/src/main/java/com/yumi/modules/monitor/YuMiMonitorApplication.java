package com.yumi.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 * 
 * @author yumi
 */
@EnableAdminServer
@SpringBootApplication
public class YuMiMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YuMiMonitorApplication.class, args);
        System.out.println("(*^▽^*)  监控中心启动成功  (〃'▽'〃) \n" +
                "\n" +
                "                          _ \n" +
                " _   _  _   _  _ __ ___  (_)\n" +
                "| | | || | | || '_ ` _ \\ | |\n" +
                "| |_| || |_| || | | | | || |\n" +
                " \\__, | \\__,_||_| |_| |_||_|\n" +
                " |___/                      \n");
    }
}
