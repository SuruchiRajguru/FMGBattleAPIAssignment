package com.FMG.BattleAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FMG.BattleAPI.Entity.Battle;

public interface BattleRepository extends MongoRepository<Battle,String> {
	
	//public Battle findBattleName(String name);
	

}
