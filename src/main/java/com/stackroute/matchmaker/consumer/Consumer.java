package com.stackroute.matchmaker.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	private static Logger logger = LoggerFactory.getLogger(Consumer.class);
		
	@KafkaListener(topics="myTopic")
	public void consumer(@Payload String string)  {
		logger.warn(string);
	}

}
