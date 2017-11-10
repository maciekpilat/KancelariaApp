/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.pilat.model.Event;

/**
 *
 * @author Pilat
 */
public class EventDaoImplementation implements EventDaoInterface{

@Override
public void saveOneEvent(Event e){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocProd");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
  
}
