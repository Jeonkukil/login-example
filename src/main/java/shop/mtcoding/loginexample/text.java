package shop.mtcoding.loginexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class text {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
