package org.pluralsight.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return """
                <ul>
                <li>I'm going to start a fast food chicken restaurant, and it's only going to be open on Sundays. <br>
                    It'll be called 'Chik-fil-atheist'.<li/>
                <li>My wife and I were cuddling last night when she said, 'Show me a good time.' <br>
                    So I stepped outside and ran an eleven second 100m sprint.<li/>
                <ul/>
                """;
    }
}
