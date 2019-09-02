package alararestaurant.repository;

import alararestaurant.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByName(String name);

    @Query("SELECT c FROM Category AS c " +
            "GROUP BY c.name " +
            "ORDER BY size (c.items) DESC ")
    List<Category> findCategoriesByCountItems();
}
