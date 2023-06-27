package com.wellsfargo.counselor.entity;
import javax.persistence.*;
import java.util.List;
@Entity
public class Client {
    @Id
    @GeneratedValue
    private long clientID;
    @ManyToOne
    private FinancialAdvisor financialAdvisor;
    private String name;
    @OneToMany
    private List<Portfolio> portfolios;
    public Client(){
    }
    public Client(FinancialAdvisor financialAdvisor, String name) {
        this.financialAdvisor = financialAdvisor;
        this.name = name;
    }
    public long getClientID() {
        return clientID;
    }
    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }
    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}