package org.itstep.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value={"/", "home"})
    public String index() {
        return "home/index";
    }

    @GetMapping("/login")
    public String login() {
        return "home/login";
    }

}
