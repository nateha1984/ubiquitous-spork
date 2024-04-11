package org.example.springdatasandbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class Controller {
    private final MyEntityRepo repository;

    public Controller(MyEntityRepo repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<MyEntity> test() {
        return repository.findAll();
    }
}
