package com.isyeon.listmyhome.food;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2022.09.04 이승연 최초작성
 */

@RestController
@RequestMapping("/api/food")
public class FoodController {
	
	@GetMapping("/getTest")
    public String get() {
		
		String answer = "";
		System.out.println(">>>>>>>");
		
		answer = "2323";
		
		
        return answer;
    }
	
	@PostMapping("/post")
	public String PostTest(@RequestBody String msg) {
		System.out.println(">>>>>>>");
		
	    return "post success!!!"+msg;
	}
	
	
	

}