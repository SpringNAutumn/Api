package com.liceol.prueba;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/v1/demo")
    public class demo {

        @GetMapping("hello")
        public ResponseEntity<String> sayHello()
        {
            return ResponseEntity.ok("hello from secured endpoint");
        }
    }