package ru.perm.v.maven_spring256_j11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCtrl {

    @GetMapping("/")
    public HelloDto get() {
        return new HelloDto();
    }

}
