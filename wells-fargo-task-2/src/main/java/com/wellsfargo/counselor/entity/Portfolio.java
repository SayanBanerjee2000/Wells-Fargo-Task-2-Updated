package com.wellsfargo.counselor.entity;
import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioID;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    // Constructors, getters, and setters

    public Portfolio() {
        // Default constructor
    }

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}