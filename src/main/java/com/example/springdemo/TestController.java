package com.example.springdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestController {
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getTest()
    {
        return new ResponseEntity<>("{\"message\":\"Next Commit!!!\"}", HttpStatus.OK);
    }
}
