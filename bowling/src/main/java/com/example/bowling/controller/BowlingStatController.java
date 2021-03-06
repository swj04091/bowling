package com.example.bowling.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bowling.service.BowlingStatService;

@RestController
public class BowlingStatController {
	@Autowired
	private BowlingStatService bowlingStatService;
	// 선수의 주로 사용하는 그립 분포도를 보기위한 controller
	@PostMapping("/getGripDistribution")
	public List<Map<String, Object>> getGripDistribution(){
		System.out.println("getGripDistribution 컨트롤러 요청 확인!");
		return bowlingStatService.getGripDistribution();
	}
	// 선수의 손잡이 분포도를 보기 위한 controller
	@PostMapping("/getHandDistribution")
	public List<Map<String, Object>> getHandDistribution(){
		System.out.println("getHandDistribution 컨트롤러 요청 확인!");
		return bowlingStatService.getHandDistribution();
	}
	// 성별별 선수의 공 무게 분포도를 보기 위한 controller
	@PostMapping("/getBallDistribution")
	public List<Map<String, Object>> getBallDistribution(){
		System.out.println("getBallDistribution 컨트롤러 요청 확인!");
		return bowlingStatService.getBallDistribution();
	}
	// 팀 별 평균연봉을 보기 위한 controller
	@PostMapping("/getSalaryDistribution")
	public List<Map<String, Object>> getSalaryDistribution(){
		System.out.println("getSalaryDistribution 컨트롤러 요청 확인!");
		return bowlingStatService.getSalaryDistribution();
	}
}
