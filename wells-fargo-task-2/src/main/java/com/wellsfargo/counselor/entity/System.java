package com.wellsfargo.counselor.entity;
import javax.persistence.*;
import java.util.List;
@Entity
public class System {

    @Id
    @GeneratedValue
    private Long systemID;

    private String name;
    private int uptime;

    @OneToOne
    private Dashboard dashboard;

    @OneToOne
    private Database database;

    @OneToMany
    private List<User> users;

    public System() {
    }
    public System(String name, int uptime) {
        this.name = name;
        this.uptime = uptime;
    }

    public Long getSystemID() {
        return systemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUptime() {
        return uptime;
    }

    public void setUptime(int uptime) {
        this.uptime = uptime;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}