package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




/**
 *这里修改一下
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")   //扫描dao层接口所在的位置
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		SpringApplication application = new SpringApplication(Application.class);
		application.setBannerMode(org.springframework.boot.Banner.Mode.OFF);
		application.run(args);  //启动项目
		
	}
}
