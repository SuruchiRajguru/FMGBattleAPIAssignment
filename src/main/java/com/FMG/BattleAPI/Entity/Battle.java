package com.FMG.BattleAPI.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection="BattleAPI")


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Battle {
	
	@Id
	private String _id;
	private String name;
	private Integer battle_number;
	private String attacker_king;
	private String defender_king;
	private String attacker_1;
	private String defender_1;
	
	

}
