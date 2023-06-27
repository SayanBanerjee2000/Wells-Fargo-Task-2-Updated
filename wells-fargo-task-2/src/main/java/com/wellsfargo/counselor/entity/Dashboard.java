package com.wellsfargo.counselor.entity;
import javax.persistence.*;

@Entity
public class Dashboard {

    @Id
    @GeneratedValue
    private Long dashboardID;

    @OneToOne
    private System system;

    private String framework;

    public Dashboard() {
    }

    public Dashboard(System system, String framework) {
        this.system = system;
        this.framework = framework;
    }

    public Long getDashboardID() {
        return dashboardID;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
}
