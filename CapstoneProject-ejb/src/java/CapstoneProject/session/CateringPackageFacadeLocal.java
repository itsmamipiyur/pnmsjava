/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.CateringPackage;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ChristelleAnne
 */
@Local
public interface CateringPackageFacadeLocal {

    public List<CateringPackage> findAllActive();

    void create(CateringPackage cateringPackage);

    void edit(CateringPackage cateringPackage);

    void remove(CateringPackage cateringPackage);

    CateringPackage find(Object id);

    List<CateringPackage> findAll();

}
