package soundsystem;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {
	@Autowired
	Environment env;

	@Bean
	public BlankDisc disc() {
		return new BlankDisc(env.getProperty("disc.title"),
				// jeśli podane wartości nie zostały zdefiniowane zwraca
				// domyślnie U2
				env.getProperty("disc.artist", "U2"),
				new ArrayList<String>(Arrays.asList("Sgt. Pepper's Lonely Hearts Club Band",
						"With a Little Help from My Friends", "Lucy in the Sky with Diamonds</")));
	}
}
