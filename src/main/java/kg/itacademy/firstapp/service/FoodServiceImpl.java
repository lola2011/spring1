package kg.itacademy.firstapp.service;

import kg.itacademy.firstapp.entity.Food;
import kg.itacademy.firstapp.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodServiceImpl implements FoodService {
   @Autowired
   private FoodRepository foodRepository;
    @Override
    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    @Override
    public Food getById(Long id) {
        return foodRepository.findById(id).orElse(null);
    }

    @Override
    public Food create(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public Food update(Food city) {
        return foodRepository.save(city);
    }

    @Override
    public void deleteById(Long id) {
        foodRepository.deleteById(id);

    }
}
