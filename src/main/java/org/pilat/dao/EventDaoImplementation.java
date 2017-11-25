/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import org.pilat.model.Event;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Pilat
 */
@Transactional
public class EventDaoImplementation implements EventDaoInterface {

//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocProd");
//    EntityManager em = emf.createEntityManager();
    
    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    @Override
    public void saveOneEvent(Event e) {

        entityManager.getTransaction().begin();
        entityManager.persist(e);
        entityManager.getTransaction().commit();

        // em.close();
        //emf.close();
    }

    public Event getOneEvent(Long id) {
        return entityManager.find(Event.class, id);

    }

    public List< Event> findAllEvent() {
        return entityManager.createQuery("from " + Event.class)
                .getResultList();
    }

    public void deleteOneEvent(Long id) {
        entityManager.remove(id);
    }

}
