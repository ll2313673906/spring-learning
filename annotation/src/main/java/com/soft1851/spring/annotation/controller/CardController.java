package com.soft1851.spring.annotation.controller;

import com.soft1851.spring.annotation.entity.Card;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @Author F*WT
 * @Date 2020/3/24 19:18
 * @Description
 */
@Controller
public class CardController {
    @GetMapping("/")
    public String Card(Model model){
        Card[] cards = {
                new Card(1,"Microservices","Quickly deliver production‑grade features with independently evolvable microservices","https://spring.io/images/icon-microservices-dfc414fd79f67718216adaffb5d99947.svg"),
                new Card(1,"Reactive","Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.","https://spring.io/images/icon-reactive-c8fc2d3b8a39aca37c46e270a342991a.svg"),
                new Card(2,"Cloud","Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.","https://spring.io/images/icon-cloud-73c3f4c15437e8493b3d3124fc667a08.svg"),
                new Card(3,"Web apps","Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.","https://spring.io/images/icon-webapps-16f6e97a1447fefba82fbdfc302262af.svg"),
                new Card(4,"Serverles","Frameworks for fast, secure, and responsive web applications connected to any data store.","https://spring.io/images/icon-serverless-45a8130e6dde8ec8e2b3f35e976a1644.svg"),
                new Card(5,"Serverless","The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.","https://spring.io/images/icon-streams-825456b79c33345f5bf4a6ef73dc8cbd.svg"),
                new Card(6,"Batch","Integrate with your enterprise. React to business events. Act on your streaming data in realtime.","https://spring.io/images/icon-batch-a9c48481786c57556a6a7ff9702cec0c.svg"),

        };
        List<Card> cardList = Arrays.asList(cards);
        model.addAttribute("cardList",cardList);
        return "templates/card";
    }

}
