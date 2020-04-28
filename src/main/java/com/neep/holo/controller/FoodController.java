package com.neep.holo.controller;

import com.neep.holo.dto.FoodDto;
import com.neep.holo.service.FoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FoodController {
    private FoodService foodService;

    public  FoodController(FoodService foodService){
        this.foodService = foodService;
    }

    @RequestMapping("/food")
    @ResponseBody
    public String food(Model model){
        List<FoodDto> foodDtoList = foodService.getFoodList();
        model.addAttribute("foodList", foodDtoList);
        System.out.println("foodfood"+foodDtoList);
        return "a "+foodDtoList;
    }
}
