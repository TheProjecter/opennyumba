package org.openhouse.api.database.model;
// Generated May 6, 2010 12:58:59 PM by Hibernate Tools 3.2.0.b9


import java.util.Date;

/**
 * ConceptNameTag generated by hbm2java
 */
public class ConceptNameTag  implements java.io.Serializable {


     private int conceptNameTagId;
     private String tag;
     private String description;
     private int creator;
     private Date dateCreated;
     private short voided;
     private Integer voidedBy;
     private Date dateVoided;
     private String voidReason;
     private String uuid;

    public ConceptNameTag() {
    }

	
    public ConceptNameTag(int conceptNameTagId, String tag, String description, int creator, Date dateCreated, short voided, String uuid) {
        this.conceptNameTagId = conceptNameTagId;
        this.tag = tag;
        this.description = description;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.voided = voided;
        this.uuid = uuid;
    }
    public ConceptNameTag(int conceptNameTagId, String tag, String description, int creator, Date dateCreated, short voided, Integer voidedBy, Date dateVoided, String voidReason, String uuid) {
       this.conceptNameTagId = conceptNameTagId;
       this.tag = tag;
       this.description = description;
       this.creator = creator;
       this.dateCreated = dateCreated;
       this.voided = voided;
       this.voidedBy = voidedBy;
       this.dateVoided = dateVoided;
       this.voidReason = voidReason;
       this.uuid = uuid;
    }
   
    public int getConceptNameTagId() {
        return this.conceptNameTagId;
    }
    
    public void setConceptNameTagId(int conceptNameTagId) {
        this.conceptNameTagId = conceptNameTagId;
    }
    public String getTag() {
        return this.tag;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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


