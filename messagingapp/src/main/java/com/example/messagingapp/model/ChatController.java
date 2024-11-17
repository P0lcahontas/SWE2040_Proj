package com.example.messagingapp.model;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/send") // Handle messages sent to /app/send
    @SendTo("/topic/messages") // Send the message to subscribers on /topic/messages
    public ChatMessage sendMessage(ChatMessage message) {
        message.setTimestamp(new java.util.Date().toString());
        return message;
    }
}

