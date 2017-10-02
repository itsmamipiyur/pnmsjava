/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "tblItemType")
@NamedQueries({@NamedQuery(name = "ItemType.findAll", query = "SELECT i FROM ItemType i"), @NamedQuery(name = "ItemType.findByItemTypeCode", query = "SELECT i FROM ItemType i WHERE i.itemTypeCode = :itemTypeCode"), @NamedQuery(name = "ItemType.findByItemTypeName", query = "SELECT i FROM ItemType i WHERE i.itemTypeName = :itemTypeName"), @NamedQuery(name = "ItemType.findByCreatedAt", query = "SELECT i FROM ItemType i WHERE i.createdAt = :createdAt"), @NamedQuery(name = "ItemType.findByUpdatedAt", query = "SELECT i FROM ItemType i WHERE i.updatedAt = :updatedAt"), @NamedQuery(name = "ItemType.findByDeletedAt", query = "SELECT i FROM ItemType i WHERE i.deletedAt = :deletedAt")})
public class ItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "itemTypeCode")
    private String itemTypeCode;
    @Basic(optional = false)
    @Column(name = "itemTypeName")
    private String itemTypeName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemTypeCode")
    private List<Item> itemCollection;

    public ItemType() {
    }

    public ItemType(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode;
    }

    public ItemType(String itemTypeCode, String itemTypeName) {
        this.itemTypeCode = itemTypeCode;
        this.itemTypeName = itemTypeName;
    }

    public String getItemTypeCode() {
        return itemTypeCode;
    }

    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
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

    public List<Item> getItemCollection() {
        return itemCollection;
    }

    public void setItemCollection(List<Item> itemCollection) {
        this.itemCollection = itemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemTypeCode != null ? itemTypeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemType)) {
            return false;
        }
        ItemType other = (ItemType) object;
        if ((this.itemTypeCode == null && other.itemTypeCode != null) || (this.itemTypeCode != null && !this.itemTypeCode.equals(other.itemTypeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CapstoneProject.entity.ItemType[itemTypeCode=" + itemTypeCode + "]";
    }

}
