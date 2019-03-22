package com.cjhm.subscriber;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class RedisMessageSubscriber implements MessageListener{

	public static List<String> messageList = new ArrayList<>();
	@Override
	public void onMessage(Message message, byte[] pattern) {
		messageList.add(message.toString());
		System.out.println("Message received : "+message.toString());
		
	}

}
