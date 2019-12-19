package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoforlogApplication {

	private static Logger logger= LoggerFactory.getLogger(DemoforlogApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoforlogApplication.class, args);
		logger.debug("项目启动成功");
	}

}
