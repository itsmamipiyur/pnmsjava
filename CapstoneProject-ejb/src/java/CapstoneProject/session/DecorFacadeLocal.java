/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.Decor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Acer
 */
@Local
public interface DecorFacadeLocal {

    void create(Decor decor);

    void edit(Decor decor);

    void remove(Decor decor);

    Decor find(Object id);

    List<Decor> findAll();

    List<Decor> findAllActive();
}
