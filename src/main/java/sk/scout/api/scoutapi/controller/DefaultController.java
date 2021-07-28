package sk.scout.api.scoutapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost")
@RestController
public class DefaultController {
    @GetMapping("/ping")
    public boolean ping(){
        return true ;
    }
}
