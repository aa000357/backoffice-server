package com.happytuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.ParseException;

@Controller
public class NewMainController extends NewMain{

    public ModelAndView mainAction() throws IOException, ParseException{

        ModelAndView mav = new ModelAndView();
        return mav;
    }

    @Override
    public ModelAndView mainAction(HttpServletRequest request) throws IOException, ParseException {

        ModelAndView mav = new ModelAndView(String.format("layoutMain"));

        return null;
    }
}
