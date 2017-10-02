/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.EventType;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class EventTypeFacade implements EventTypeFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(EventType eventType) {
        em.persist(eventType);
    }

    public void edit(EventType eventType) {
        em.merge(eventType);
    }

    public void remove(EventType eventType) {
        em.remove(em.merge(eventType));
    }

    public EventType find(Object id) {
        return em.find(EventType.class, id);
    }

    public List<EventType> findAll() {
        return em.createQuery("select object(o) from EventType as o").getResultList();
    }

    public List<EventType> findAllActive() {
        return em.createNativeQuery("select * from tblEventType where deleted_at is null", EventType.class).getResultList();
    }

}
