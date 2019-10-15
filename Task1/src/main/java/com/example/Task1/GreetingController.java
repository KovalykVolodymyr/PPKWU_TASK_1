package com.example.Task1;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping("/revers/{text}")
    @ResponseBody
    public String revers(@PathVariable("text") StringBuilder stringBuilder) {
        return new ReversString(stringBuilder).revers();
    }
}
