package ua.lviv.fores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Genabra on 29.08.2016.
 */
@Controller
public class BaseController {


    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }


    @RequestMapping(value = "/my/registration/page", method = RequestMethod.GET)
    public String registration(){
        return "q";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

}
