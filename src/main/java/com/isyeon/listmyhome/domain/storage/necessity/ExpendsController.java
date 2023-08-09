package com.isyeon.listmyhome.domain.storage.necessity;

import com.isyeon.listmyhome.common.DrinkType;
import com.isyeon.listmyhome.common.ExpandType;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 소모품 재고 정리
 */
@Tag(name = "Expands", description = "소모품 재고 정리")
@RestController
@RequestMapping("/expand")
public class ExpendsController {
    //현재 재고 모두 조회
    @GetMapping("/all")
    @ResponseBody
    public List<String> findAllExpand(){
        return null;
    }

    //현재 재고 타입별 조회
    @GetMapping("/type")
    @ResponseBody
    public List<String> findExpand(ExpandType expandType){
        return null;
    }

    //신규 등록

    //상태 변경

    //삭제
}
