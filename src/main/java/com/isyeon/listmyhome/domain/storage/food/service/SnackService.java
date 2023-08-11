package com.isyeon.listmyhome.domain.storage.food.service;

import com.isyeon.listmyhome.common.SnackType;
import com.isyeon.listmyhome.domain.storage.food.dto.FindSnackResponse;
import com.isyeon.listmyhome.domain.storage.food.entity.Snack;
import com.isyeon.listmyhome.domain.storage.food.repository.SnackRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SnackService {

    private final SnackRepository snackRepository;

    private final ModelMapper modelMapper;

    /*
    모두 조회
     */
    public List<FindSnackResponse> findAllSnack() {
        List<Snack> snackList = snackRepository.findAll();
        List<FindSnackResponse> responseList =
                snackList.stream().map(p -> modelMapper.map(p, FindSnackResponse.class))
                        .collect(Collectors.toList());
        return responseList;
    }

     /*
    snack_type으로 조회
     */
     public List<FindSnackResponse> findAllSnack(SnackType snackType) {
         List<Snack> snackList = snackRepository.findBySnack_type(snackType);
         List<FindSnackResponse> responseList =
                 snackList.stream().map(p -> modelMapper.map(p, FindSnackResponse.class))
                         .collect(Collectors.toList());
         return responseList;
     }
}
