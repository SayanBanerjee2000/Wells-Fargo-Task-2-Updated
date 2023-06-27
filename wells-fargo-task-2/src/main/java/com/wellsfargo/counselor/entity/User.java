package com.wellsfargo.counselor.entity;
import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userID;
    private String name;
    @ManyToOne
    private System system;
    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public Long getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public System getSystem() {
        return system;
    }
    public void setSystem(System system) {
        this.system = system;
    }
}

