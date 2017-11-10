/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.dao;

import org.pilat.model.Event;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pilat
 */
    @Repository
public interface EventDaoInterface {

    void saveOneEvent(Event e);
//    getOneEvent
//    getAll
}
