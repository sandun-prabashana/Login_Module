package com.epic.atemlogin.util.mapping;
// Generated Feb 5, 2019 12:40:42 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Passwordpolicy generated by hbm2java
 */
@Entity
@Table(name="sys_passwordpolicy"
)
public class Passwordpolicy  implements java.io.Serializable {


     private String policyid;
     private Status status;
     private String description;
     private Short maxlength;
     private Short minlength;
     private Short minnumchars;
     private Short minspecialchars;
     private Short minupperchars;
     private String specialchars;
     private String lastupdateduser;
     private Date lastupdatedtime;
     private Date createdtime;

    public Passwordpolicy() {
    }

	
    public Passwordpolicy(String policyid, Date lastupdatedtime, Date createdtime) {
        this.policyid = policyid;
        this.lastupdatedtime = lastupdatedtime;
        this.createdtime = createdtime;
    }
    public Passwordpolicy(String policyid, Status status, String description, Short maxlength, Short minlength, Short minnumchars, Short minspecialchars, Short minupperchars, String specialchars, String lastupdateduser, Date lastupdatedtime, Date createdtime) {
       this.policyid = policyid;
       this.status = status;
       this.description = description;
       this.maxlength = maxlength;
       this.minlength = minlength;
       this.minnumchars = minnumchars;
       this.minspecialchars = minspecialchars;
       this.minupperchars = minupperchars;
       this.specialchars = specialchars;
       this.lastupdateduser = lastupdateduser;
       this.lastupdatedtime = lastupdatedtime;
       this.createdtime = createdtime;
    }
   
     @Id 

    
    @Column(name="POLICYID", unique=true, nullable=false, length=32)
    public String getPolicyid() {
        return this.policyid;
    }
    
    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STATUS")
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }

    
    @Column(name="DESCRIPTION", length=64)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="MAXLENGTH")
    public Short getMaxlength() {
        return this.maxlength;
    }
    
    public void setMaxlength(Short maxlength) {
        this.maxlength = maxlength;
    }

    
    @Column(name="MINLENGTH")
    public Short getMinlength() {
        return this.minlength;
    }
    
    public void setMinlength(Short minlength) {
        this.minlength = minlength;
    }

    
    @Column(name="MINNUMCHARS")
    public Short getMinnumchars() {
        return this.minnumchars;
    }
    
    public void setMinnumchars(Short minnumchars) {
        this.minnumchars = minnumchars;
    }

    
    @Column(name="MINSPECIALCHARS")
    public Short getMinspecialchars() {
        return this.minspecialchars;
    }
    
    public void setMinspecialchars(Short minspecialchars) {
        this.minspecialchars = minspecialchars;
    }

    
    @Column(name="MINUPPERCHARS")
    public Short getMinupperchars() {
        return this.minupperchars;
    }
    
    public void setMinupperchars(Short minupperchars) {
        this.minupperchars = minupperchars;
    }

    
    @Column(name="SPECIALCHARS", length=32)
    public String getSpecialchars() {
        return this.specialchars;
    }
    
    public void setSpecialchars(String specialchars) {
        this.specialchars = specialchars;
    }

    
    @Column(name="LASTUPDATEDUSER", length=64)
    public String getLastupdateduser() {
        return this.lastupdateduser;
    }
    
    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LASTUPDATEDTIME", nullable=false, length=19)
    public Date getLastupdatedtime() {
        return this.lastupdatedtime;
    }
    
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATEDTIME", nullable=false, length=19)
    public Date getCreatedtime() {
        return this.createdtime;
    }
    
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }




}


