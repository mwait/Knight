package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(CDConfig.class) łączenie konfiguracji opartych o kod Java, może też przyjmować kilka {a.class,b.class}
//@ImportResource("classpath:plik.xml") wczytanie konfiguracji z xmla, w drugą stronę i xml z xml str. 84
/*
 * jeśli więcej pakietów: @ComponentScan(basePackages={"soundsystem", "innypakiet"})
 * @ComponentScan może również przyjmować klasy lub interfejsy (pakiety bazowe)
 * @ComponentScan(basePackageClasses={"Klasa1.class", "Klasa2.class"}) - zabezpieczamy się przed 
 * zmianą pakietów
 */
@ComponentScan("soundsystem")
public class CDPlayerConfig {
	/*
	//definiowanie komponentu w springu w kodzie jawy (jeśli nie mamy klasy oznaczonej adnotacją @Component
	@Bean(name="compactDisc")
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	@Bean 
	public CDPlayer cdPlayer () {
		return new CDPlayer(sgtPeppers());
	}
	
	//gdybyśnie nie mieli w tej klasie zadeklarowanego componentu CompactDisc (np. byłby gdzieś w xmlach)
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc)
	{ return new CDPlayer(compactDisc); }
	
	//wstrzykiwanie przez setter
	@Bean
	public CDPlayer cdPlayerDISetter(CompactDisc compactDisc)
	{ 	CDPlayer cdPlayer = new CDPlayer();
		cdPlayer.setCd(compactDisc);
		return cdPlayer; }
	//zwraca losowo wybrany component 
	@Bean
	public CompactDisc randomBeatlesCD() {
		int choice = (int)Math.floor(Math.random() * 3);
		if(choice == 0) { return new SgtPeppers();}
		else if (choice == 1) { return new SgtPeppers();}
		else { return new SgtPeppers();}
	}*/
}
