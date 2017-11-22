/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.dao;

import java.util.List;
import org.pilat.model.Event;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDaoInterface {

    void saveOneEvent(Event e);

    Event getOneEvent(Long id);

    List<Event> findAllEvent();

    void deleteOneEvent(Long id);
}
