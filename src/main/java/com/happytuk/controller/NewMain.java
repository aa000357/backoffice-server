package com.happytuk.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public abstract class NewMain {

    @RequestMapping("gm/index")
    public abstract ModelAndView mainAction(@PathVariable HttpServletRequest request)throws IOException, java.text.ParseException;

}
