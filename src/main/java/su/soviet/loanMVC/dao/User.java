package su.soviet.loanMVC.dao;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Car car;
}
