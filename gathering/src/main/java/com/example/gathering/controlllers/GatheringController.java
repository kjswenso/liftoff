package com.example.gathering.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GatheringController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Hello World";
    }
}
