/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.Decor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Acer
 */
@Stateless
public class DecorFacade implements DecorFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(Decor decor) {
        em.persist(decor);
    }

    public void edit(Decor decor) {
        em.merge(decor);
    }

    public void remove(Decor decor) {
        em.remove(em.merge(decor));
    }

    public Decor find(Object id) {
        return em.find(Decor.class, id);
    }

    public List<Decor> findAll() {
        return em.createQuery("select object(o) from Decor as o").getResultList();
    }

    public List<Decor> findAllActive() {
        return em.createNativeQuery("SELECT * FROM tblDecor WHERE deleted_at is null", Decor.class).getResultList();
    }

}
