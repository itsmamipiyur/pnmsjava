/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.CateringPackage;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ChristelleAnne
 */
@Stateless
public class CateringPackageFacade implements CateringPackageFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(CateringPackage cateringPackage) {
        em.persist(cateringPackage);
    }

    public void edit(CateringPackage cateringPackage) {
        em.merge(cateringPackage);
    }

    public void remove(CateringPackage cateringPackage) {
        em.remove(em.merge(cateringPackage));
    }

    public CateringPackage find(Object id) {
        return em.find(CateringPackage.class, id);
    }

    public List<CateringPackage> findAll() {
        return em.createQuery("select object(o) from CateringPackage as o").getResultList();
    }

    public List<CateringPackage> findAllActive() {
        return em.createNativeQuery("SELECT * from tblCateringPackage WHERE deleted_at is null", CateringPackage.class).getResultList();
    }

}
