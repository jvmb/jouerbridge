package com.jvmb.jouerbridge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class jouerCtrl {

    private static final Logger logger = LoggerFactory.getLogger(jouerCtrl.class);

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        logger.info("getHome()");
        model.addAttribute("name", name);
        return "home";
    }

}
