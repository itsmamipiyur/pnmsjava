/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CapstoneProject.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author ChristelleAnne
 */
@Entity
@Table(name = "tblRentalPackage")
@NamedQueries({@NamedQuery(name = "TblRentalPackage.findAll", query = "SELECT t FROM TblRentalPackage t"), @NamedQuery(name = "TblRentalPackage.findByRentalPackageCode", query = "SELECT t FROM TblRentalPackage t WHERE t.rentalPackageCode = :rentalPackageCode"), @NamedQuery(name = "TblRentalPackage.findByRentalPackageName", query = "SELECT t FROM TblRentalPackage t WHERE t.rentalPackageName = :rentalPackageName"), @NamedQuery(name = "TblRentalPackage.findByRentalPackageUnit", query = "SELECT t FROM TblRentalPackage t WHERE t.rentalPackageUnit = :rentalPackageUnit"), @NamedQuery(name = "TblRentalPackage.findByAmount", query = "SELECT t FROM TblRentalPackage t WHERE t.amount = :amount"), @NamedQuery(name = "TblRentalPackage.findByCreatedAt", query = "SELECT t FROM TblRentalPackage t WHERE t.createdAt = :createdAt"), @NamedQuery(name = "TblRentalPackage.findByUpdatedAt", query = "SELECT t FROM TblRentalPackage t WHERE t.updatedAt = :updatedAt"), @NamedQuery(name = "TblRentalPackage.findByDeletedAt", query = "SELECT t FROM TblRentalPackage t WHERE t.deletedAt = :deletedAt")})
public class RentalPackage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rentalPackageCode")
    private String rentalPackageCode;
    @Basic(optional = false)
    @Column(name = "rentalPackageName")
    private String rentalPackageName;
    @Lob
    @Column(name = "rentalPackageDesc")
    private String rentalPackageDesc;
    @Basic(optional = false)
    @Column(name = "rentalPackageUnit")
    private boolean rentalPackageUnit;
    @Basic(optional = false)
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    public RentalPackage() {
    }

    public RentalPackage(String rentalPackageCode) {
        this.rentalPackageCode = rentalPackageCode;
    }

    public RentalPackage(String rentalPackageCode, String rentalPackageName, boolean rentalPackageUnit, BigDecimal amount) {
        this.rentalPackageCode = rentalPackageCode;
        this.rentalPackageName = rentalPackageName;
        this.rentalPackageUnit = rentalPackageUnit;
        this.amount = amount;
    }

    public String getRentalPackageCode() {
        return rentalPackageCode;
    }

    public void setRentalPackageCode(String rentalPackageCode) {
        this.rentalPackageCode = rentalPackageCode;
    }

    public String getRentalPackageName() {
        return rentalPackageName;
    }

    public void setRentalPackageName(String rentalPackageName) {
        this.rentalPackageName = rentalPackageName;
    }

    public String getRentalPackageDesc() {
        return rentalPackageDesc;
    }

    public void setRentalPackageDesc(String rentalPackageDesc) {
        this.rentalPackageDesc = rentalPackageDesc;
    }

    public boolean getRentalPackageUnit() {
        return rentalPackageUnit;
    }

    public void setRentalPackageUnit(boolean rentalPackageUnit) {
        this.rentalPackageUnit = rentalPackageUnit;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
        hash += (rentalPackageCode != null ? rentalPackageCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RentalPackage)) {
            return false;
        }
        RentalPackage other = (RentalPackage) object;
        if ((this.rentalPackageCode == null && other.rentalPackageCode != null) || (this.rentalPackageCode != null && !this.rentalPackageCode.equals(other.rentalPackageCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CapstoneProject.entity.TblRentalPackage[rentalPackageCode=" + rentalPackageCode + "]";
    }

}
