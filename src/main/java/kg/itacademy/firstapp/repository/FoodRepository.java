package kg.itacademy.firstapp.repository;

import kg.itacademy.firstapp.entity.City;
import kg.itacademy.firstapp.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food,Long> {
}
