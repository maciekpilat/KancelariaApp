/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue
    private Long event_id;
    private Long event_type;

    public Event (Long event_id, Long event_type){
        this.event_id = event_id;
        this.event_type = event_type;
    }
    
    /**
     * @return the event_id
     */
    public Long getEvent_id() {
        return event_id;
    }

    /**
     * @param event_id the event_id to set
     */
    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

    /**
     * @return the event_type
     */
    public Long getEvent_type() {
        return event_type;
    }

    /**
     * @param event_type the event_type to set
     */
    public void setEvent_type(Long event_type) {
        this.event_type = event_type;
    }

    
}
