package ru.sapteh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manufacture")

public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name",nullable = false)
    private String name;
    @Column(name = "StartDate",nullable = false)
    private String startDate;




    @Override
    public String toString(){
        return "manufacture{"+
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }



}
