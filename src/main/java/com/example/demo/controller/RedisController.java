package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;

@RestController
public class RedisController {
	
	@Autowired
	RedisTemplate redisTemplate;
	
	@PostMapping( "/addtoredis")
	public String addToredis(@RequestParam String key){
		Model model = new Model();
		redisTemplate.opsForValue().set(key, model);
		
		System.out.println(redisTemplate.opsForValue().get(key));
		
		return "ok";
		
	}

}
