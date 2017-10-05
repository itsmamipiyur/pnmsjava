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
 * @author ChristelleAnne
 */
@Entity
@Table(name = "tblCateringPackage")
@NamedQueries({@NamedQuery(name = "TblCateringPackage.findAll", query = "SELECT t FROM TblCateringPackage t"), @NamedQuery(name = "TblCateringPackage.findByCateringPackageCode", query = "SELECT t FROM TblCateringPackage t WHERE t.cateringPackageCode = :cateringPackageCode"), @NamedQuery(name = "TblCateringPackage.findByCateringPackageName", query = "SELECT t FROM TblCateringPackage t WHERE t.cateringPackageName = :cateringPackageName"), @NamedQuery(name = "TblCateringPackage.findByAmount", query = "SELECT t FROM TblCateringPackage t WHERE t.amount = :amount"), @NamedQuery(name = "TblCateringPackage.findByCreatedAt", query = "SELECT t FROM TblCateringPackage t WHERE t.createdAt = :createdAt"), @NamedQuery(name = "TblCateringPackage.findByUpdatedAt", query = "SELECT t FROM TblCateringPackage t WHERE t.updatedAt = :updatedAt"), @NamedQuery(name = "TblCateringPackage.findByDeletedAt", query = "SELECT t FROM TblCateringPackage t WHERE t.deletedAt = :deletedAt")})
public class CateringPackage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cateringPackageCode")
    private String cateringPackageCode;
    @Basic(optional = false)
    @Column(name = "cateringPackageName")
    private String cateringPackageName;
    @Lob
    @Column(name = "cateringPackageDesc")
    private String cateringPackageDesc;
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
    @JoinColumn(name = "eventTypeCode", referencedColumnName = "eventTypeCode")
    @ManyToOne(optional = false)
    private EventType eventTypeCode;

    public CateringPackage() {
    }

    public CateringPackage(String cateringPackageCode) {
        this.cateringPackageCode = cateringPackageCode;
    }

    public CateringPackage(String cateringPackageCode, String cateringPackageName, BigDecimal amount) {
        this.cateringPackageCode = cateringPackageCode;
        this.cateringPackageName = cateringPackageName;
        this.amount = amount;
    }

    public String getCateringPackageCode() {
        return cateringPackageCode;
    }

    public void setCateringPackageCode(String cateringPackageCode) {
        this.cateringPackageCode = cateringPackageCode;
    }

    public String getCateringPackageName() {
        return cateringPackageName;
    }

    public void setCateringPackageName(String cateringPackageName) {
        this.cateringPackageName = cateringPackageName;
    }

    public String getCateringPackageDesc() {
        return cateringPackageDesc;
    }

    public void setCateringPackageDesc(String cateringPackageDesc) {
        this.cateringPackageDesc = cateringPackageDesc;
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

    public EventType getEventTypeCode() {
        return eventTypeCode;
    }

    public void setEventTypeCode(EventType eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cateringPackageCode != null ? cateringPackageCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CateringPackage)) {
            return false;
        }
        CateringPackage other = (CateringPackage) object;
        if ((this.cateringPackageCode == null && other.cateringPackageCode != null) || (this.cateringPackageCode != null && !this.cateringPackageCode.equals(other.cateringPackageCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CapstoneProject.entity.TblCateringPackage[cateringPackageCode=" + cateringPackageCode + "]";
    }

}
