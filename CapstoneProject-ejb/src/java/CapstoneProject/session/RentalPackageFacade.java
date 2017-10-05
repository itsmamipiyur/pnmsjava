/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.RentalPackage;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ChristelleAnne
 */
@Stateless
public class RentalPackageFacade implements RentalPackageFacadeLocal {
    @PersistenceContext
    private EntityManager em;

    public void create(RentalPackage rentalPackage) {
        em.persist(rentalPackage);
    }

    public void edit(RentalPackage rentalPackage) {
        em.merge(rentalPackage);
    }

    public void remove(RentalPackage rentalPackage) {
        em.remove(em.merge(rentalPackage));
    }

    public RentalPackage find(Object id) {
        return em.find(RentalPackage.class, id);
    }

    public List<RentalPackage> findAll() {
        return em.createQuery("select object(o) from RentalPackage as o").getResultList();
    }

    public List<RentalPackage> findAllActive() {
        return em.createNativeQuery("SELECT * from tblRentalPackage WHERE deleted_at is null", RentalPackage.class).getResultList();
    }

}
