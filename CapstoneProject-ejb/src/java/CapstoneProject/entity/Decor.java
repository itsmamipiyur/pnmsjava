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
import javax.persistence.Transient;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "tblDecor")
@NamedQueries({@NamedQuery(name = "Decor.findAll", query = "SELECT d FROM Decor d"), @NamedQuery(name = "Decor.findByDecorCode", query = "SELECT d FROM Decor d WHERE d.decorCode = :decorCode"), @NamedQuery(name = "Decor.findByDecorName", query = "SELECT d FROM Decor d WHERE d.decorName = :decorName"), @NamedQuery(name = "Decor.findByDecorType", query = "SELECT d FROM Decor d WHERE d.decorType = :decorType"), @NamedQuery(name = "Decor.findByCreatedAt", query = "SELECT d FROM Decor d WHERE d.createdAt = :createdAt"), @NamedQuery(name = "Decor.findByUpdatedAt", query = "SELECT d FROM Decor d WHERE d.updatedAt = :updatedAt"), @NamedQuery(name = "Decor.findByDeletedAt", query = "SELECT d FROM Decor d WHERE d.deletedAt = :deletedAt")})
public class Decor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "decorCode")
    private String decorCode;
    @Basic(optional = false)
    @Column(name = "decorName")
    private String decorName;
    @Basic(optional = false)
    @Column(name = "decorType")
    private int decorType;
    @Lob
    @Column(name = "decorDesc")
    private String decorDesc;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    @Transient
    private String decorTypeName;

    public Decor() {
    }

    public Decor(String decorCode) {
        this.decorCode = decorCode;
    }

    public Decor(String decorCode, String decorName, int decorType) {
        this.decorCode = decorCode;
        this.decorName = decorName;
        this.decorType = decorType;
    }

    public String getDecorTypeName() {
        return decorTypeName;
    }

    public void setDecorTypeName(String decorTypeName) {
        this.decorTypeName = decorTypeName;
    }

    

    public String getDecorCode() {
        return decorCode;
    }

    public void setDecorCode(String decorCode) {
        this.decorCode = decorCode;
    }

    public String getDecorName() {
        return decorName;
    }

    public void setDecorName(String decorName) {
        this.decorName = decorName;
    }

    public int getDecorType() {
        return decorType;
    }

    public void setDecorType(int decorType) {
        this.decorType = decorType;
    }

    public String getDecorDesc() {
        return decorDesc;
    }

    public void setDecorDesc(String decorDesc) {
        this.decorDesc = decorDesc;
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
        hash += (decorCode != null ? decorCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Decor)) {
            return false;
        }
        Decor other = (Decor) object;
        if ((this.decorCode == null && other.decorCode != null) || (this.decorCode != null && !this.decorCode.equals(other.decorCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CapstoneProject.entity.Decor[decorCode=" + decorCode + "]";
    }

}
