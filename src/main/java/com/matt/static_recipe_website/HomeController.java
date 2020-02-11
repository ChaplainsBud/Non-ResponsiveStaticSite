package com.matt.static_recipe_website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
        public String index() {
                return "index";
    }

    @RequestMapping("/food")
    public String recipes() {
        return "recipes";
    }

    @RequestMapping("/ramja")
    public String curry() {
        return "curry";
    }

    @RequestMapping("/kebab")
    public String kebab() {
        return "kebab";
    }

    @RequestMapping("/author")
    public String author() {
        return "author";
    }
}
