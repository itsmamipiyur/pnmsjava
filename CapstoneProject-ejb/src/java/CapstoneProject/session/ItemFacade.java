/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.Item;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class ItemFacade implements ItemFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Item item) {
        em.persist(item);
    }

    public void edit(Item item) {
        em.merge(item);
    }

    public void remove(Item item) {
        em.remove(em.merge(item));
    }

    public Item find(Object id) {
        return em.find(Item.class, id);
    }

    public List<Item> findAll() {
        return em.createQuery("select object(o) from Item as o").getResultList();
    }

    public List<Item> findAllActive() {
        return em.createNativeQuery("SELECT * from tblItem where deleted_at is null", Item.class).getResultList();
    }

}
