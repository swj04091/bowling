package com.example.bowling.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bowling.service.BowlingScheduleService;
import com.example.bowling.vo.Schedule;

@RestController
public class BowlingScheduleController {
	@Autowired BowlingScheduleService bowlingScheduleService;
	
	//날짜별 경기 결과를 가져오는 controller
	@PostMapping("/schedule")
	public List<Schedule> getSchedule(){
		System.out.println("bowilng controller getSchedule -----------------------------");
		List<Schedule> list = new ArrayList<Schedule>();
		list = bowlingScheduleService.getSchedule();
		System.out.println("list"+list);
		return list;
	}
	//gameNo값을 받아 경기 결과 상세보기(전광판) return 리스트 맵타입
	@PostMapping("/scheduleOne")
	public List<Map<String,Object>> getScheduleOne(int gameNo,int currentPage){
		System.out.println("gameNo:"+gameNo);
		System.out.println("현 페이지:"+currentPage);
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = bowlingScheduleService.getScheduleOne(gameNo,currentPage);
		System.out.println("점수 값 확인:"+list);
		
		return list;
	}
	
}
