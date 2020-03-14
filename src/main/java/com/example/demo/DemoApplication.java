package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoApplication.class, args);
			System.out.println("#############################################");
			System.out.println("#####-----启动成功-----#####");
			System.out.println("#############################################");
		} catch (Exception e) {
			System.out.println("#############################################");
			System.out.println("#####启动失败#####");
			System.out.println("#############################################");
		}
	}

}
