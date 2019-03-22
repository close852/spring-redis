package com.cjhm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

import com.cjhm.entity.Employee;
import com.cjhm.publisher.RedisMessagePublisher;

@Service
public class RedisService {

	
//	@Autowired
	private StringRedisTemplate strRedisTemplate;
	
//	@Autowired
	ChannelTopic topics;
	
//	@Autowired
	RedisMessagePublisher redisPublisher;
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Resource(name = "redisTemplate")
	private ListOperations<String, Object> listOps;

	@Resource(name = "redisTemplate")
	private HashOperations<String, String, String> hashOps;

	@Resource(name = "redisTemplate")
	private SetOperations<String, String> setOps;

	public void test() {
		try {

			// ValueOperations<String, Object> values =
			// redisTemplate.opsForValue();
			// values.set("emp1", new Employee("1", "jiwoo", 29));
			// System.out.println("emp added : " + values.get("emp1"));

//			Map<String, String> empJiwooMap = new HashMap<>();
//			empJiwooMap.put("name", "jiwoo");
//			empJiwooMap.put("age","29");
//			empJiwooMap.put("id","02");
//			hashOps.putAll("emp:jiwoo", empJiwooMap);
//			System.out.println(hashOps.entries("emp:jiwoo"));
//			
//			List<Employee> empBobList = new ArrayList<>();
//			empBobList.add(new Employee("a1", "aa"));
//			empBobList.add(new Employee("a2", "aa"));
//			empBobList.add(new Employee("a3", "aa"));
//			listOps.rightPush("hi", empBobList);
//			listOps.rightPush("hi1", empBobList);
//			listOps.rightPush("hi3", empBobList);
//			listOps.leftPush("hi0", empBobList);
			System.out.println(listOps.leftPop("hi3"));
			System.out.println(listOps.leftPop("hi1"));
			System.out.println(listOps.leftPop("hi"));
			System.out.println(listOps.leftPop("hi0"));
			System.out.println(listOps.leftPop("hi0"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void subTest() {
		String message = "Message!!!!!";
		redisPublisher.publish(message);
	}
}
