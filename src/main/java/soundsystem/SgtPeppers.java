package soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("odtwarzam utwór " + title + " artysty " + artist);
	}

	public void playTrack(int i) {
		// TODO
	}

}
