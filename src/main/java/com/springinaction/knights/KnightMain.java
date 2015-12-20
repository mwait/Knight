package com.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class KnightMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				com.springinaction.knights.config.KnightConfig.class);
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
		((AbstractApplicationContext) context).close();
	}
}
