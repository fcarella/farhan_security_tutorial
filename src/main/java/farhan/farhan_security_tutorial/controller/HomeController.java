package farhan.farhan_security_tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/home")
public class HomeController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() { // map a URL to a method
        return ResponseEntity.ok("Hello");
    }
}
