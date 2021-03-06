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
import javax.transaction.Transactional;
import org.pilat.model.EventType;

//event_type_id;
//event_type_name;
/**
 *
 * @author Pilat
 */
@Transactional
public class EventTypeDaoImplementation implements EventTypeDaoInterface {

    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    @Override
    public EventType getOneEventType(Long evnt_type_id) {
        System.out.println("Pobieram jeden typ eventu!");
        entityManager.getTransaction().begin();
        EventType e = entityManager.find(EventType.class, evnt_type_id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Oto dane pobranego eventu: " + e);
        return e;
    }

    public void saveOneEventType(EventType e) {
        System.out.println("Zapisuję dane!");
        entityManager.getTransaction().begin();
        entityManager.persist(e);
        entityManager.getTransaction().commit();
        entityManager.close();
System.out.println("Zapisałem dane!");
    }

    @Transactional
    @Override
    public List<EventType> getAllEventType() {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityManagerFactory");
        //entityManager = emf.createEntityManager();
        System.out.println("Pobieram wszystkie typy eventów!");
        entityManager.getTransaction().begin();
        List<EventType> eventTypeList = entityManager.createQuery("SELECT event_type_id, event_type_name  FROM EventType").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
         System.out.println("Pobrałem wszystkie typy eventów!");
        //emf.close();
        return eventTypeList;
    }

    public List< EventType> findAllEvent() {
        return entityManager.createQuery("from " + EventType.class)
                .getResultList();
    }

    public void deleteOneEventType(Long id) {
        entityManager.remove(id);
    }

}
