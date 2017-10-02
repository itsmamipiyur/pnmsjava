/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.DishType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Acer
 */
@Local
public interface DishTypeFacadeLocal {

    void create(DishType dishType);

    void edit(DishType dishType);

    void remove(DishType dishType);

    DishType find(Object id);

    List<DishType> findAll();

    List<DishType> findAllActive();

}
