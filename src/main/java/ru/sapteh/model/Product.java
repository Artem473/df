package ru.sapteh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Title", nullable = false)
    private String title;
    @Column(name = "Cost", nullable = false)
    private String cost;
    @Column(name = "Description")
    private String description;
    @Column(name = "IsActive")
    private String isActive;


    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost='" + cost + '\'' +
                ", description='" + description + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}

