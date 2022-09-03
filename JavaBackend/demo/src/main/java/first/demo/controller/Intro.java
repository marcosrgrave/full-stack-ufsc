package first.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/intro")
public class Intro {
    
    @GetMapping("/get")  // -> equivalent to "/intro/get"
    @ResponseBody
    public String showSomething() {
        return "GET";
    }

    @PostMapping("/post")  // -> equivalent to "/intro/post"
    @ResponseBody
    public String showPost() {
        return "POST";
    }
    
}
