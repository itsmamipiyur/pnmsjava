/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "tblEventType")
@NamedQueries({@NamedQuery(name = "EventType.findAll", query = "SELECT e FROM EventType e"), @NamedQuery(name = "EventType.findByEventTypeCode", query = "SELECT e FROM EventType e WHERE e.eventTypeCode = :eventTypeCode"), @NamedQuery(name = "EventType.findByEventTypeName", query = "SELECT e FROM EventType e WHERE e.eventTypeName = :eventTypeName"), @NamedQuery(name = "EventType.findByCreatedAt", query = "SELECT e FROM EventType e WHERE e.createdAt = :createdAt"), @NamedQuery(name = "EventType.findByUpdatedAt", query = "SELECT e FROM EventType e WHERE e.updatedAt = :updatedAt"), @NamedQuery(name = "EventType.findByDeletedAt", query = "SELECT e FROM EventType e WHERE e.deletedAt = :deletedAt")})
public class EventType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "eventTypeCode")
    private String eventTypeCode;
    @Basic(optional = false)
    @Column(name = "eventTypeName")
    private String eventTypeName;
    @Lob
    @Column(name = "eventTypeDesc")
    private String eventTypeDesc;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    public EventType() {
    }

    public EventType(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    public EventType(String eventTypeCode, String eventTypeName) {
        this.eventTypeCode = eventTypeCode;
        this.eventTypeName = eventTypeName;
    }

    public String getEventTypeCode() {
        return eventTypeCode;
    }

    public void setEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public String getEventTypeDesc() {
        return eventTypeDesc;
    }

    public void setEventTypeDesc(String eventTypeDesc) {
        this.eventTypeDesc = eventTypeDesc;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventTypeCode != null ? eventTypeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventType)) {
            return false;
        }
        EventType other = (EventType) object;
        if ((this.eventTypeCode == null && other.eventTypeCode != null) || (this.eventTypeCode != null && !this.eventTypeCode.equals(other.eventTypeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CapstoneProject.entity.EventType[eventTypeCode=" + eventTypeCode + "]";
    }

}
