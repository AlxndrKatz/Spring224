package su.soviet.loanMVC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import su.soviet.loanMVC.dao.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
