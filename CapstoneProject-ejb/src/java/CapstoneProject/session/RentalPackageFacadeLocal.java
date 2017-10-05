/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.RentalPackage;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ChristelleAnne
 */
@Local
public interface RentalPackageFacadeLocal {

    public List<RentalPackage> findAllActive();

    void create(RentalPackage rentalPackage);

    void edit(RentalPackage rentalPackage);

    void remove(RentalPackage rentalPackage);

    RentalPackage find(Object id);

    List<RentalPackage> findAll();

}
