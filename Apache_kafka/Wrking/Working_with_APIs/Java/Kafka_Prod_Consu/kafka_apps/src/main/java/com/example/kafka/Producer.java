package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	private static final String TOPIC = "Topic1";
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void SendMessage(String message) {
		
		this.kafkaTemplate.send(TOPIC,message);
		
	}
}
