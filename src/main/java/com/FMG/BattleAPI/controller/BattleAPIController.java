package com.FMG.BattleAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FMG.BattleAPI.Entity.Battle;
import com.FMG.BattleAPI.service.BattleService;

@RestController
@RequestMapping("/BattleAPI")
@CrossOrigin(origins = "*")

public class BattleAPIController {

	@Autowired
	private BattleService battleService;
	
//	@GetMapping("/name")
//	public ResponseEntity<Battle> getBattle()
//	{
//		ResponseEntity<Battle> battles=battleService.getAllBattle();
//		return battles;
//	}
//	
	
	@GetMapping("/name")
	public List<Battle> getBattle()
	{
		return battleService.getAllBattle();
		
	}
	
	@GetMapping("/name/id")
	public List<Battle> getBattleByName()
	{
	//	return battleService.getBattleByName(name);
		return battleService.getAllBattle();
		
	}
	
	
}
