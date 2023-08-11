package com.isyeon.listmyhome.domain.storage.cloth.service;

import com.isyeon.listmyhome.common.SEASON;
import com.isyeon.listmyhome.domain.storage.cloth.dto.FindClothResponse;
import com.isyeon.listmyhome.domain.storage.cloth.entity.Cloth;
import com.isyeon.listmyhome.domain.storage.cloth.repository.ClothRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClothService {

    private final ClothRepository clothRepository;

    private final ModelMapper modelMapper;

    //옷장 전체 아이템 조회
    @Transactional(readOnly = true)
    public List<FindClothResponse> findAllCloth() {
        List<Cloth> clothes = clothRepository.findAll();
        List<FindClothResponse> responseList =
                clothes.stream().map(p -> modelMapper.map(p, FindClothResponse.class))
                        .collect(Collectors.toList());
        return responseList;
    }

    //옷장 현재 계절 조회
    @Transactional(readOnly = true)
    public List<FindClothResponse> findSeosonCloth(SEASON season) {
        List<Cloth> clothes = clothRepository.findBySeason(season);
        List<FindClothResponse> responseList =
                clothes.stream().map(p -> modelMapper.map(p, FindClothResponse.class))
                        .collect(Collectors.toList());
        return responseList;
    }

    //옷장 새로운 옷 등록

    //옷장 빨랫감 추가

    //아이템 구매

    //아이템 삭제
}
