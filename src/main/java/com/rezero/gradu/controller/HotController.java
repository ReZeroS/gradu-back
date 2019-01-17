package com.rezero.gradu.controller;


import com.rezero.gradu.entity.Hot;
import com.rezero.gradu.service.HotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class HotController {

    @Autowired
    private HotService hotService;


    @GetMapping("/savehot")
    public void saveHot(){
        hotService.saveHot(new Hot((long) 1, "lala"));
    }

    @GetMapping("/searches")
    @ResponseBody
    public Hot search(){
        return hotService.findByName("lala");
    }


}
