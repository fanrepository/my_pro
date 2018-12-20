package com.whizen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.whizen.mapper")
public class Demo02Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo02Application.class, args) ;
	}
	
}
