package com.wellsfargo.counselor.entity;
import javax.persistence.*;

@Entity
public class Database {
    @Id
    @GeneratedValue
    private Long databaseID;
    @OneToOne
    private System system;
    private String type;
    public Database() {
    }
    public Database(System system, String type) {
        this.system = system;
        this.type = type;
    }
    public Long getDatabaseID() {
        return databaseID;
    }
    public System getSystem() {
        return system;
    }
    public void setSystem(System system) {
        this.system = system;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}

