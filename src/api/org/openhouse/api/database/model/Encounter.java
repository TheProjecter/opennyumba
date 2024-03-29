package org.openhouse.api.database.model;
// Generated May 6, 2010 12:58:59 PM by Hibernate Tools 3.2.0.b9


import java.util.Date;

/**
 * Encounter generated by hbm2java
 */
public class Encounter  implements java.io.Serializable {


     private int encounterId;
     private Integer encounterType;
     private int groupId;
     private int locationId;
     private Integer formId;
     private Date encounterDatetime;
     private int creator;
     private Date dateCreated;
     private short voided;
     private Integer voidedBy;
     private Date dateVoided;
     private String voidReason;
     private String uuid;

    public Encounter() {
    }

	
    public Encounter(int encounterId, int groupId, int locationId, Date encounterDatetime, int creator, Date dateCreated, short voided, String uuid) {
        this.encounterId = encounterId;
        this.groupId = groupId;
        this.locationId = locationId;
        this.encounterDatetime = encounterDatetime;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.voided = voided;
        this.uuid = uuid;
    }
    public Encounter(int encounterId, Integer encounterType, int groupId, int locationId, Integer formId, Date encounterDatetime, int creator, Date dateCreated, short voided, Integer voidedBy, Date dateVoided, String voidReason, String uuid) {
       this.encounterId = encounterId;
       this.encounterType = encounterType;
       this.groupId = groupId;
       this.locationId = locationId;
       this.formId = formId;
       this.encounterDatetime = encounterDatetime;
       this.creator = creator;
       this.dateCreated = dateCreated;
       this.voided = voided;
       this.voidedBy = voidedBy;
       this.dateVoided = dateVoided;
       this.voidReason = voidReason;
       this.uuid = uuid;
    }
   
    public int getEncounterId() {
        return this.encounterId;
    }
    
    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }
    public Integer getEncounterType() {
        return this.encounterType;
    }
    
    public void setEncounterType(Integer encounterType) {
        this.encounterType = encounterType;
    }
    public int getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    public int getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
    public Integer getFormId() {
        return this.formId;
    }
    
    public void setFormId(Integer formId) {
        this.formId = formId;
    }
    public Date getEncounterDatetime() {
        return this.encounterDatetime;
    }
    
    public void setEncounterDatetime(Date encounterDatetime) {
        this.encounterDatetime = encounterDatetime;
    }
    public int getCreator() {
        return this.creator;
    }
    
    public void setCreator(int creator) {
        this.creator = creator;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public short getVoided() {
        return this.voided;
    }
    
    public void setVoided(short voided) {
        this.voided = voided;
    }
    public Integer getVoidedBy() {
        return this.voidedBy;
    }
    
    public void setVoidedBy(Integer voidedBy) {
        this.voidedBy = voidedBy;
    }
    public Date getDateVoided() {
        return this.dateVoided;
    }
    
    public void setDateVoided(Date dateVoided) {
        this.dateVoided = dateVoided;
    }
    public String getVoidReason() {
        return this.voidReason;
    }
    
    public void setVoidReason(String voidReason) {
        this.voidReason = voidReason;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }




}


