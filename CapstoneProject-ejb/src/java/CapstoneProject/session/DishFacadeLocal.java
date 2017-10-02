/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.Dish;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Acer
 */
@Local
public interface DishFacadeLocal {

    void create(Dish dish);

    void edit(Dish dish);

    void remove(Dish dish);

    Dish find(Object id);

    List<Dish> findAll();

    List<Dish> findAllActive();

}
