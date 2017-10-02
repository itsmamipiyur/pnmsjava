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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "tblItem")
@NamedQueries({@NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i"), @NamedQuery(name = "Item.findByItemCode", query = "SELECT i FROM Item i WHERE i.itemCode = :itemCode"), @NamedQuery(name = "Item.findByItemName", query = "SELECT i FROM Item i WHERE i.itemName = :itemName"), @NamedQuery(name = "Item.findByBaseUnit", query = "SELECT i FROM Item i WHERE i.baseUnit = :baseUnit"), @NamedQuery(name = "Item.findByExtnUnit", query = "SELECT i FROM Item i WHERE i.extnUnit = :extnUnit"), @NamedQuery(name = "Item.findByMaxBaseDuration", query = "SELECT i FROM Item i WHERE i.maxBaseDuration = :maxBaseDuration"), @NamedQuery(name = "Item.findByMaxExtnDuration", query = "SELECT i FROM Item i WHERE i.maxExtnDuration = :maxExtnDuration"), @NamedQuery(name = "Item.findByPenaltyCharge", query = "SELECT i FROM Item i WHERE i.penaltyCharge = :penaltyCharge"), @NamedQuery(name = "Item.findByLimit", query = "SELECT i FROM Item i WHERE i.limit = :limit"), @NamedQuery(name = "Item.findByCreatedAt", query = "SELECT i FROM Item i WHERE i.createdAt = :createdAt"), @NamedQuery(name = "Item.findByUpdatedAt", query = "SELECT i FROM Item i WHERE i.updatedAt = :updatedAt"), @NamedQuery(name = "Item.findByDeletedAt", query = "SELECT i FROM Item i WHERE i.deletedAt = :deletedAt")})
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "itemCode")
    private String itemCode;
    @Basic(optional = false)
    @Column(name = "itemName")
    private String itemName;
    @Lob
    @Column(name = "itemDesc")
    private String itemDesc;
    @Basic(optional = false)
    @Column(name = "baseUnit")
    private boolean baseUnit;
    @Basic(optional = false)
    @Column(name = "extnUnit")
    private boolean extnUnit;
    @Basic(optional = false)
    @Column(name = "maxBaseDuration")
    private int maxBaseDuration;
    @Basic(optional = false)
    @Column(name = "maxExtnDuration")
    private int maxExtnDuration;
    @Basic(optional = false)
    @Column(name = "penaltyCharge")
    private int penaltyCharge;
    @Column(name = "limit")
    private Integer limit;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @JoinColumn(name = "itemTypeCode", referencedColumnName = "itemTypeCode")
    @ManyToOne(optional = false)
    private ItemType itemTypeCode;

    public Item() {
    }

    public Item(String itemCode) {
        this.itemCode = itemCode;
    }

    public Item(String itemCode, String itemName, boolean baseUnit, boolean extnUnit, int maxBaseDuration, int maxExtnDuration, int penaltyCharge) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.baseUnit = baseUnit;
        this.extnUnit = extnUnit;
        this.maxBaseDuration = maxBaseDuration;
        this.maxExtnDuration = maxExtnDuration;
        this.penaltyCharge = penaltyCharge;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public boolean getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(boolean baseUnit) {
        this.baseUnit = baseUnit;
    }

    public boolean getExtnUnit() {
        return extnUnit;
    }

    public void setExtnUnit(boolean extnUnit) {
        this.extnUnit = extnUnit;
    }

    public int getMaxBaseDuration() {
        return maxBaseDuration;
    }

    public void setMaxBaseDuration(int maxBaseDuration) {
        this.maxBaseDuration = maxBaseDuration;
    }

    public int getMaxExtnDuration() {
        return maxExtnDuration;
    }

    public void setMaxExtnDuration(int maxExtnDuration) {
        this.maxExtnDuration = maxExtnDuration;
    }

    public int getPenaltyCharge() {
        return penaltyCharge;
    }

    public void setPenaltyCharge(int penaltyCharge) {
        this.penaltyCharge = penaltyCharge;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
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

    public ItemType getItemTypeCode() {
        return itemTypeCode;
    }

    public void setItemTypeCode(ItemType itemTypeCode) {
        this.itemTypeCode = itemTypeCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemCode != null ? itemCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemCode == null && other.itemCode != null) || (this.itemCode != null && !this.itemCode.equals(other.itemCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CapstoneProject.entity.Item[itemCode=" + itemCode + "]";
    }

}
