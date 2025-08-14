package org.example.controller;

import org.example.model.Greeting;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class WebSocketController {

    @MessageMapping("/hello") //LISTEN MESSAGES THAT CLIENT
    @SendTo("/topic/greetings") //RESPONSE THA ALL THAT CONECT
    public Greeting greeting(String name) {
        return new Greeting("Hello, " + name + "!");
    }
}