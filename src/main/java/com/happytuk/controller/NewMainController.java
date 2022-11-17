package com.happytuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.ParseException;

@Controller
public class NewMainController {

    public ModelAndView mainAction() throws IOException, ParseException{

        ModelAndView mav = new ModelAndView();
        return mav;
    }

}
