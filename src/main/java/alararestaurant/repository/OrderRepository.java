package alararestaurant.repository;

import alararestaurant.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query("SELECT o FROM Order AS o JOIN Employee AS e ON o.employee = e.id " +
            "WHERE e.position.name = 'Burger Flipper' " +
            "ORDER BY e.name, o.id")
    List<Order> finishedByBurgerFlippers();

}
