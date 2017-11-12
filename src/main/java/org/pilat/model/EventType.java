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
@Table(name = "sl_event_type")
public class EventType {

    @Id
    @GeneratedValue
    private Long event_type_id;
    private String event_type_name;

    public EventType (Long event_type_id, String event_type_name){
        this.event_type_id = event_type_id;
        this.event_type_name = event_type_name;
    }

    /**
     * @return the event_type_id
     */
    public Long getEvent_type_id() {
        return event_type_id;
    }

    /**
     * @param event_type_id the event_type_id to set
     */
    public void setEvent_type_id(Long event_type_id) {
        this.event_type_id = event_type_id;
    }

    /**
     * @return the event_type_name
     */
    public String getEvent_type_name() {
        return event_type_name;
    }

    /**
     * @param event_type_name the event_type_name to set
     */
    public void setEvent_type_name(String event_type_name) {
        this.event_type_name = event_type_name;
    }
    
    
}
