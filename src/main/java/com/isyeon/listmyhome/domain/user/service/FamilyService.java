package com.isyeon.listmyhome.domain.user.service;

import com.isyeon.listmyhome.domain.user.dto.FindFamilyResponse;
import com.isyeon.listmyhome.domain.user.entity.Family;
import com.isyeon.listmyhome.domain.user.repository.FamilyRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FamilyService {

    private final FamilyRepository familyRepository;
    private final ModelMapper modelMapper;


    /*
    모두 조회
     */
    public List<FindFamilyResponse> findAllFamily(){
        List<Family> familyList = familyRepository.findAll();
        List<FindFamilyResponse> responseList =
                familyList.stream().map(p -> modelMapper.map(p, FindFamilyResponse.class))
                        .collect(Collectors.toList());
        return responseList;
    }

    /*
    family_id로 조회
     */
    public FindFamilyResponse findFamilyById(Long id){
        Family familyInfo = familyRepository.getById(id);
        return modelMapper.map(familyInfo, FindFamilyResponse.class);
    }
}
