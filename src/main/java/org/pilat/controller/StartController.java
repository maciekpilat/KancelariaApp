/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.dao.EventTypeDaoInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Pilat
 */
@Controller
public class StartController {

     public EventTypeDaoInterface etdi;
    
     
    
    @RequestMapping("/")
    public String start(Model model) { 
        
        return "start";
    }

}
