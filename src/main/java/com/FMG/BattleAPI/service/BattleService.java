package com.FMG.BattleAPI.service;

import java.util.List;

import com.FMG.BattleAPI.Entity.Battle;

public interface BattleService {

	List<Battle> getAllBattle();
	
	Battle getBattleByName(String name);
}
