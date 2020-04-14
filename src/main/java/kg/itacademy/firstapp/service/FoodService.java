package kg.itacademy.firstapp.service;

import kg.itacademy.firstapp.entity.Food;

import java.util.List;

public interface FoodService {
    List<Food>getAll();
    Food getById(Long id);
    Food create(Food food);
    Food update(Food city);
    void deleteById(Long id);
}
