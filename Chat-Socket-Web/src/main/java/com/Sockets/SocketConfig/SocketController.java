package com.Sockets.SocketConfig;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Sockets.MessageEntity;

@Controller
public class SocketController {

	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/public")
	public MessageEntity sendMessage(@Payload MessageEntity messageEntity)
	{
		return messageEntity;
	}
	
	@MessageMapping("/chat.addUser")
	@SendTo("/topic/public")
	public 	MessageEntity getUser(@Payload MessageEntity messageEntity,SimpMessageHeaderAccessor accessor)
	{
		accessor.getSessionAttributes().put("username", messageEntity.getSender());
		return messageEntity;
	}
	
	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
}
