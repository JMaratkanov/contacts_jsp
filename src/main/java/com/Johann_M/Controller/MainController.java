package com.Johann_M.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showWelcomePage(ModelMap model) {
        return "index";
    }

}