package com.FMG.BattleAPI.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FMG.BattleAPI.Entity.Battle;
import com.FMG.BattleAPI.repository.BattleRepository;
import com.FMG.BattleAPI.service.BattleService;

@Service
public class BattleServiceImpl implements BattleService {
	
	@Autowired
	public BattleRepository battleRepository;

	@Override
	public List<Battle> getAllBattle() {
		// TODO Auto-generated method stub
		List<Battle> battles=battleRepository.findAll();
		return battles;
	}

	@Override
	public Battle getBattleByName(String name) {
		
		return null;
		//return battleRepository.findOne(Optional<Battle>);
	}
	
	

//	@Override
//	public Battle getBattleById(String _id) {
//		
//		return battleRepository.findById(_id).get();
//	}

}
