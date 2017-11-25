/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.dao.EventTypeDaoInterface;
import org.pilat.model.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Pilat
 */
@Controller
public class EventController {

    //@Autowired
   public EventTypeDaoInterface etdi;

    @RequestMapping("/addevent")
    public String addEvent(Model model) {

System.out.println("ODPALAM CONTROLLER!!!");
//model.addAttribute("eventTypeList", etdi.getOneEventType(1L));
System.out.println(etdi.getOneEventType(1L));
EventType e = new EventType(6L, "Nowy event");
etdi.saveOneEventType(e);

        return "addEvent";
    }

}
