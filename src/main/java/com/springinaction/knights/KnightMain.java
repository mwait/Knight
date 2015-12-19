package com.springinaction.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springinaction.knights.config.KnightConfig;

public class KnightMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
		context.close();
	}
}
