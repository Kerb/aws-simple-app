package net.kerba.webapp.simpleservice.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/api/service/method1")
    public Resp service() {
        return new Resp("payload: " + LocalDateTime.now());
    }

    public static class Resp implements Serializable {

        private final String data;

        public Resp(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }
    }
}
