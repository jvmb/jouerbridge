package com.jvmb.jouerbridge.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class jouerCtrl {

    private static final Logger logger = LoggerFactory.getLogger(jouerCtrl.class);

    /**
     * 
     * @param model
     * @param locale
     * @return
     */
    @RequestMapping(value = "/homejsp", method = RequestMethod.GET)
    public String getHomeJsp(Model model, Locale locale) {
        logger.info("getHomeJsp()");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);

        return "homejsp";
    }

}
