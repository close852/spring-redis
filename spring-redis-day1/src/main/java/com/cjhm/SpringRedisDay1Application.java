package com.cjhm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjhm.entity.Employee;
import com.cjhm.service.RedisService;

@SpringBootApplication
@RestController
public class SpringRedisDay1Application {

	@Autowired
	RedisService redisService;

	@GetMapping("/")
	public String index() {

//		 redisService.test();
		 redisService.subTest();
//		Employee emp = new Employee("1", "2");
//		System.out.println(emp);
		return "hello idx";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisDay1Application.class, args);
	}

}
