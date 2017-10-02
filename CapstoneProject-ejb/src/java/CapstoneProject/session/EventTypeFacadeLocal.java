/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.session;

import CapstoneProject.entity.EventType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Acer
 */
@Local
public interface EventTypeFacadeLocal {

    public List<EventType> findAllActive();

    void create(EventType eventType);

    void edit(EventType eventType);

    void remove(EventType eventType);

    EventType find(Object id);

    List<EventType> findAll();

}
