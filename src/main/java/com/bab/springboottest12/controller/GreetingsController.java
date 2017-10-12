/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bab.springboottest12.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Liter
 */
@RestController
public class GreetingsController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String greetings(){
        return "Greetings, app is running";
    }
    
    @RequestMapping(value = "/hungariangreetings", method = RequestMethod.GET)
    public String hungarianGreetings(){
        return "Csagec";
    }
}
