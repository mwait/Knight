package soundsystem;

import java.util.List;


public class BlankDisc implements CompactDisc {

	// SPEL gdyby konstruktor tej klasy miał pobierać dane z właściwości
	// systemowych
	/*
	 * public BlankDisc(
	 * 
	 * @Value("#{systemProperties['disc.title']}") String title,
	 * 
	 * @Value("#{systemProperties['disc.artist']}") String artist, int i) {
	 * this.title = title; this.artist = artist;}
	 */
	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	public BlankDisc() {
	}
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}
	public void playTrack (int i) {
		System.out.println("Playing one track" + title + " by " + artist);
		System.out.println("-Track: " + tracks.get(i));
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	
	
}
