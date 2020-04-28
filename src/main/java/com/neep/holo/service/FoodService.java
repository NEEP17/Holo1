package com.neep.holo.service;

import com.neep.holo.domain.entity.Food;
import com.neep.holo.domain.repository.FoodRepository;
import com.neep.holo.dto.FoodDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
    private FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    @Transactional
    public List<FoodDto> getFoodList(){
        List<Food> foods = foodRepository.findAll();
        List<FoodDto> foodDtoList = new ArrayList<>();


        return foodDtoList;
    }

}
