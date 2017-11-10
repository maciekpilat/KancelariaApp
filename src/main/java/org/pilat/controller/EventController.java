/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Pilat
 */
@Controller
public class EventController {

    @RequestMapping("/addevent")
    public String addEvent(Model model) {
        System.out.println("klocek");

        return "addEvent";
    }
    
}
