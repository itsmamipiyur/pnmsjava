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
import javax.persistence.Lob;
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
@Table(name = "tblDishType")
@NamedQueries({@NamedQuery(name = "DishType.findAll", query = "SELECT d FROM DishType d"), @NamedQuery(name = "DishType.findByDishTypeCode", query = "SELECT d FROM DishType d WHERE d.dishTypeCode = :dishTypeCode"), @NamedQuery(name = "DishType.findByDishTypeName", query = "SELECT d FROM DishType d WHERE d.dishTypeName = :dishTypeName"), @NamedQuery(name = "DishType.findByCreatedAt", query = "SELECT d FROM DishType d WHERE d.createdAt = :createdAt"), @NamedQuery(name = "DishType.findByUpdatedAt", query = "SELECT d FROM DishType d WHERE d.updatedAt = :updatedAt"), @NamedQuery(name = "DishType.findByDeletedAt", query = "SELECT d FROM DishType d WHERE d.deletedAt = :deletedAt")})
public class DishType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dishTypeCode")
    private String dishTypeCode;
    @Basic(optional = false)
    @Column(name = "dishTypeName")
    private String dishTypeName;
    @Lob
    @Column(name = "dishTypeDesc")
    private String dishTypeDesc;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dishTypeCode")
    private List<Dish> dishCollection;

    public DishType() {
    }

    public DishType(String dishTypeCode) {
        this.dishTypeCode = dishTypeCode;
    }

    public DishType(String dishTypeCode, String dishTypeName) {
        this.dishTypeCode = dishTypeCode;
        this.dishTypeName = dishTypeName;
    }

    public String getDishTypeCode() {
        return dishTypeCode;
    }

    public void setDishTypeCode(String dishTypeCode) {
        this.dishTypeCode = dishTypeCode;
    }

    public String getDishTypeName() {
        return dishTypeName;
    }

    public void setDishTypeName(String dishTypeName) {
        this.dishTypeName = dishTypeName;
    }

    public String getDishTypeDesc() {
        return dishTypeDesc;
    }

    public void setDishTypeDesc(String dishTypeDesc) {
        this.dishTypeDesc = dishTypeDesc;
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

    public List<Dish> getDishCollection() {
        return dishCollection;
    }

    public void setDishCollection(List<Dish> dishCollection) {
        this.dishCollection = dishCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dishTypeCode != null ? dishTypeCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DishType)) {
            return false;
        }
        DishType other = (DishType) object;
        if ((this.dishTypeCode == null && other.dishTypeCode != null) || (this.dishTypeCode != null && !this.dishTypeCode.equals(other.dishTypeCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CapstoneProject.entity.DishType[dishTypeCode=" + dishTypeCode + "]";
    }

}
