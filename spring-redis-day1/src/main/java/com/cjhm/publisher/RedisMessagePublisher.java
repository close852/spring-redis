package com.cjhm.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;

public class RedisMessagePublisher implements MessagePublisher {

	@Autowired
	private StringRedisTemplate strRedisTemplate;

	@Autowired
	private ChannelTopic topics;

	public RedisMessagePublisher() {
	}

	public RedisMessagePublisher(StringRedisTemplate strRedisTemplate, ChannelTopic topics) {
		this.strRedisTemplate = strRedisTemplate;
		this.topics = topics;
	}

	@Override
	public void publish(String message) {
		strRedisTemplate.convertAndSend(topics.getTopic(), message);
	}

}
