/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.DishType;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class DishTypeFacade implements DishTypeFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(DishType dishType) {
        em.persist(dishType);
    }

    public void edit(DishType dishType) {
        em.merge(dishType);
    }

    public void remove(DishType dishType) {
        em.remove(em.merge(dishType));
    }

    public DishType find(Object id) {
        return em.find(DishType.class, id);
    }

    public List<DishType> findAll() {
        return em.createQuery("select object(o) from DishType as o").getResultList();
    }

    public List<DishType> findAllActive() {
        return em.createNativeQuery("SELECT * FROM tblDishType WHERE deleted_at is null", DishType.class).getResultList();
    }

}
