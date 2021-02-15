package ru.sapteh.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productsale")
public class ProductSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "SaleDate",nullable = false)
    private String saleDate;

    @Column(name = "Quantity",nullable = false)
    private String quantity;
    @Column(name = "ProductId",nullable = false)
    private String productId;



    @Override
    public String toString(){
        return "productsale{"+
                "id=" + id +
                ", quantity='" + quantity + '\'' +
                ",productId='" + productId + '\'' +
                '}';

    }
}
