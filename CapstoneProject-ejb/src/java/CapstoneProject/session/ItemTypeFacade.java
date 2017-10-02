/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.ItemType;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class ItemTypeFacade implements ItemTypeFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(ItemType itemType) {
        em.persist(itemType);
    }

    public void edit(ItemType itemType) {
        em.merge(itemType);
    }

    public void remove(ItemType itemType) {
        em.remove(em.merge(itemType));
    }

    public ItemType find(Object id) {
        return em.find(ItemType.class, id);
    }

    public List<ItemType> findAll() {
        return em.createQuery("select object(o) from ItemType as o").getResultList();
    }

}
