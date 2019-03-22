package com.cjhm.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("point")
public class Point {

	@Id
	private String id;
	private Long amount;
	private LocalDateTime refreshTime;

	public Point() {
	}

	public void refresh(Long amount, LocalDateTime refreshTime) {
		if (refreshTime.isAfter(this.refreshTime)) {
			this.amount = amount;
			this.refreshTime = refreshTime;
		}
	}

	public Point(String id, Long amount, LocalDateTime refreshTime) {
		this.id = id;
		this.amount = amount;
		this.refreshTime = refreshTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public LocalDateTime getRefreshTime() {
		return refreshTime;
	}

	public void setRefreshTime(LocalDateTime refreshTime) {
		this.refreshTime = refreshTime;
	}

}
