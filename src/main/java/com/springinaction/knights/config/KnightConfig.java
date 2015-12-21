package com.springinaction.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Knight;
import com.springinaction.knights.Quest;
import com.springinaction.knights.SlayDragonQuest;

@Configuration
@ImportResource("classpath:knights-config.xml") 
public class KnightConfig {

	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
