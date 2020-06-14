package com.sr.springstreamkafka.stream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.MessageChannel;

public interface GreetingsStreams {
	String INPUT = "greetings-in";
	String OUTPUT = "greetings-out";
	
	@Input(INPUT)
	SubscribableChannel inboundGreetings(); //to read msg from Kafka topic
    //A MessageChannel that maintains a registry of subscribers and invokes them
	//to handle messages sent through this channel.
	
	@Output(OUTPUT)
	MessageChannel outboundGreetings();
	//to write meesages to a Kafka topic
}
