package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue
    private Long financialAdvisorID;
    private String name;

    @OneToMany
    private List<Client> clients;
    @OneToMany
    private List<Security> securities;

    public FinancialAdvisor(){
    }
    public FinancialAdvisor(String name){
        this.name=name;
    }
    public Long getFinancialAdvisorID(){
        return financialAdvisorID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
