package com.rezero.gradu.controller;


import com.rezero.gradu.entity.Card;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


@RestController
@RequestMapping("dev")
public class DevFrontController {


    private static final Logger logger = LoggerFactory.getLogger(DevFrontController.class);

    int consst = 0;

    @GetMapping("random_jokes")
    public List<Card> randomJokes(){
        List<Card> cards = new LinkedList<Card>();
        cards.add(new Card(1, "test1", "puch"));
        cards.add(new Card(2, "test2", "puch"));
        return cards;
    }

    @GetMapping("random_joke")
    public Card randomJoke(){
        return new Card(consst++, "test" + consst, "puch");
    }

    @PostMapping("login")
    @ResponseBody
    public HashMap<String, Integer> login(){
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("1", 1);
        hash.put("2", 2);
        logger.info("login ...");
        return hash;
    }


    @GetMapping("query")
    @ResponseBody
    public HashMap<String, Integer> query(){
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("success", 1066);
        return hash;
    }

}
