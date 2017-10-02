/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.ItemType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Acer
 */
@Local
public interface ItemTypeFacadeLocal {

    void create(ItemType itemType);

    void edit(ItemType itemType);

    void remove(ItemType itemType);

    ItemType find(Object id);

    List<ItemType> findAll();

}
