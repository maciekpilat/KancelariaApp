/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.dao;

import java.util.List;
import org.pilat.model.EventType;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pilat
 */
@Repository
public interface EventTypeDaoInterface {

     EventType getOneEventType(Long evnt_type_id);

    void saveOneEventType(EventType e);

    List<EventType> getAllEventType();

    void deleteOneEventType(Long id);

}
