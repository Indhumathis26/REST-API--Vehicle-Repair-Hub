package com.rest.springapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int rating;
    private String comment;
    private Long user;  // Treated as an identifier, not a relationship
    private Long repairShop; // Treated as an identifier, not a relationship

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public Long getUser() { return user; }
    public void setUser(Long user) { this.user = user; }
    public Long getRepairShop() { return repairShop; }
    public void setRepairShop(Long repairShop) { this.repairShop = repairShop; }
}