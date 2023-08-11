package com.isyeon.listmyhome.domain.storage.food.service;

import com.isyeon.listmyhome.common.DrinkType;
import com.isyeon.listmyhome.domain.storage.food.dto.FindDrinkResponse;
import com.isyeon.listmyhome.domain.storage.food.entity.Drink;
import com.isyeon.listmyhome.domain.storage.food.repository.DrinkRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DrinkService {

    private final DrinkRepository drinkRepository;

    private ModelMapper modelMapper;

    /*
    모두 조회
     */
    public List<FindDrinkResponse> findAllDrink(){
        List<Drink> drinkList = drinkRepository.findAll();
        List<FindDrinkResponse> responseList =
                drinkList.stream().map(p -> modelMapper.map(p, FindDrinkResponse.class))
                        .collect(Collectors.toList());
        return responseList;
    }

    /*
    drink_type으로 조회
     */
    public List<FindDrinkResponse> findAllDrink(DrinkType drinkType){
        List<Drink> drinkList = drinkRepository.findByDrink_type(drinkType);
        List<FindDrinkResponse> responseList =
                drinkList.stream().map(p -> modelMapper.map(p, FindDrinkResponse.class))
                        .collect(Collectors.toList());
        return responseList;
    }

    /*
    id 값으로 조회
     */
    public FindDrinkResponse findAllDrink(Long id){

        Drink drinkInfo = drinkRepository.getById(id);
        return modelMapper.map(drinkInfo, FindDrinkResponse.class);
    }

}
