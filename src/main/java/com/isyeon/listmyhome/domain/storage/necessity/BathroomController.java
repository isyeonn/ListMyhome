package com.isyeon.listmyhome.domain.storage.necessity;

import com.isyeon.listmyhome.common.BathType;
import com.isyeon.listmyhome.common.DrinkType;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 화장실 용품과 관련된 재고 관리
 */
@Tag(name = "Bathrooms", description = "화장실 용품 관련 재고 관리")
@RestController
@RequestMapping("/bathroom")
public class BathroomController {

    //현재 재고 모두 조회
    @GetMapping("/all")
    @ResponseBody
    public List<String> findAllBath(){
        return null;
    }

    //현재 재고 타입별 조회
    @GetMapping("/type")
    @ResponseBody
    public List<String> findBath(BathType bathType){
        return null;
    }
    //신규 등록

    //상태 변경

    //삭제

}
