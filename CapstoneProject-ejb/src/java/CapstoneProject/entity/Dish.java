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
import javax.persistence.Transient;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "tblDish")
@NamedQueries({@NamedQuery(name = "Dish.findAll", query = "SELECT d FROM Dish d"), @NamedQuery(name = "Dish.findByDishCode", query = "SELECT d FROM Dish d WHERE d.dishCode = :dishCode"), @NamedQuery(name = "Dish.findByDishName", query = "SELECT d FROM Dish d WHERE d.dishName = :dishName"), @NamedQuery(name = "Dish.findByCreatedAt", query = "SELECT d FROM Dish d WHERE d.createdAt = :createdAt"), @NamedQuery(name = "Dish.findByUpdatedAt", query = "SELECT d FROM Dish d WHERE d.updatedAt = :updatedAt"), @NamedQuery(name = "Dish.findByDeletedAt", query = "SELECT d FROM Dish d WHERE d.deletedAt = :deletedAt")})
public class Dish implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dishCode")
    private String dishCode;
    @Basic(optional = false)
    @Column(name = "dishName")
    private String dishName;
    @Lob
    @Column(name = "dishDesc")
    private String dishDesc;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @JoinColumn(name = "dishTypeCode", referencedColumnName = "dishTypeCode")
    @ManyToOne(optional = false)
    private DishType dishTypeCode;

    @Transient
    private String dishTypeName;

    public Dish() {
    }

    public String getDishTypeName() {
        return dishTypeName;
    }

    public void setDishTypeName(String dishTypeName) {
        this.dishTypeName = dishTypeName;
    }

    public Dish(String dishCode) {
        this.dishCode = dishCode;
    }

    public Dish(String dishCode, String dishName) {
        this.dishCode = dishCode;
        this.dishName = dishName;
    }

    public String getDishCode() {
        return dishCode;
    }

    public void setDishCode(String dishCode) {
        this.dishCode = dishCode;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishDesc() {
        return dishDesc;
    }

    public void setDishDesc(String dishDesc) {
        this.dishDesc = dishDesc;
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

    public DishType getDishTypeCode() {
        return dishTypeCode;
    }

    public void setDishTypeCode(DishType dishTypeCode) {
        this.dishTypeCode = dishTypeCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dishCode != null ? dishCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dish)) {
            return false;
        }
        Dish other = (Dish) object;
        if ((this.dishCode == null && other.dishCode != null) || (this.dishCode != null && !this.dishCode.equals(other.dishCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CapstoneProject.entity.Dish[dishCode=" + dishCode + "]";
    }

}
