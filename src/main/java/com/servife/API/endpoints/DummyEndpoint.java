package com.servife.API.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyEndpoint {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello world!";
    }

}
