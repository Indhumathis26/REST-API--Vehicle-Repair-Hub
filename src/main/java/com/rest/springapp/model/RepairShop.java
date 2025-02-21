package com.rest.springapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "repair_shops")
public class RepairShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String services;
    private Double rating;
    private String maintenanceTips;
    private String owner; // Change from Long to String
    
    @Version  // Add this field for optimistic locking
    private Long version;

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and Setter for services
    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    // Getter and Setter for rating
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    // Getter and Setter for maintenanceTips
    public String getMaintenanceTips() {
        return maintenanceTips;
    }

    public void setMaintenanceTips(String maintenanceTips) {
        this.maintenanceTips = maintenanceTips;
    }

    // Getter and Setter for owner
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    
}
