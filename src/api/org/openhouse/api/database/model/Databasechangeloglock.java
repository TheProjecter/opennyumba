package org.openhouse.api.database.model;
// Generated May 6, 2010 12:58:59 PM by Hibernate Tools 3.2.0.b9


import java.util.Date;

/**
 * Databasechangeloglock generated by hbm2java
 */
public class Databasechangeloglock  implements java.io.Serializable {


     private int id;
     private boolean locked;
     private Date lockgranted;
     private String lockedby;

    public Databasechangeloglock() {
    }

	
    public Databasechangeloglock(int id, boolean locked) {
        this.id = id;
        this.locked = locked;
    }
    public Databasechangeloglock(int id, boolean locked, Date lockgranted, String lockedby) {
       this.id = id;
       this.locked = locked;
       this.lockgranted = lockgranted;
       this.lockedby = lockedby;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public boolean isLocked() {
        return this.locked;
    }
    
    public void setLocked(boolean locked) {
        this.locked = locked;
    }
    public Date getLockgranted() {
        return this.lockgranted;
    }
    
    public void setLockgranted(Date lockgranted) {
        this.lockgranted = lockgranted;
    }
    public String getLockedby() {
        return this.lockedby;
    }
    
    public void setLockedby(String lockedby) {
        this.lockedby = lockedby;
    }




}

