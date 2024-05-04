package su.soviet.loanMVC.dao;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Car")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String manufacturer;

    private String model;

    private int price;

    @OneToOne(mappedBy = "car")
    private User user;
}