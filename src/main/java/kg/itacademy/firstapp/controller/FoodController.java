package kg.itacademy.firstapp.controller;

import kg.itacademy.firstapp.entity.City;
import kg.itacademy.firstapp.entity.Food;
import kg.itacademy.firstapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/{id}")//localhost:8080/city/50
    public Food getById(@PathVariable Long id) {
        return foodService.getById(id);
    }

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.create(food);
    }
    @DeleteMapping("/{id}")
    public  void deleteById(@PathVariable Long id){
        foodService.deleteById(id);
    }
    @PutMapping
    public Food update(@RequestBody Food  food){
        return foodService.update(food);
    }

}
