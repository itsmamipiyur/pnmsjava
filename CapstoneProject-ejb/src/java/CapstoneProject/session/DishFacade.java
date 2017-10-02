/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.Dish;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class DishFacade implements DishFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Dish dish) {
        em.persist(dish);
    }

    public void edit(Dish dish) {
        em.merge(dish);
    }

    public void remove(Dish dish) {
        em.remove(em.merge(dish));
    }

    public Dish find(Object id) {
        return em.find(Dish.class, id);
    }

    public List<Dish> findAll() {
        return em.createQuery("select object(o) from Dish as o").getResultList();
    }

    public List<Dish> findAllActive() {
        return em.createNativeQuery("SELECT * from tblDish WHERE deleted_at is null", Dish.class).getResultList();
    }

}
