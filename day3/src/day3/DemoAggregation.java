package day3;
//MusicGroup<>----Musician
class Musician{
	private String musicianName;
	private String musicInstrument;
	private int rating;
	
	public Musician(String musicianName, String musicInstrument, int rating) {
		this.musicianName = musicianName;
		this.musicInstrument = musicInstrument;
		this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void printMusicianDetails() {
		System.out.println("----------------------------");
        System.out.println("musicianName: "+ musicianName);
        System.out.println("musicInstument: "+ musicInstrument);
        System.out.println("rating: "+ rating);
        System.out.println("----------------------------");
	}

	public void perform() {
		System.out.println("sa re ga ma pa");		
	}
}

class MusicGroup{
	private Musician musician;
	private String musicGroupName, musicGroupAddress;
	
	public MusicGroup(String musicGroupName, String musicGroupAddress) {
		
	}
	
	public void hireMusician(Musician musician) {
		this.musician = musician;
	}
	
	public void program() {
		System.out.println("musicGroupName: "+ musicGroupName);
        System.out.println("musicGroupAddress: "+ musicGroupAddress);
		musician.perform();
	}
}

public class DemoAggregation {
	public static void main(String[] args) {
		Musician musician = new Musician("yash","guitar",2);
		MusicGroup group = new MusicGroup("T-series","Mumbai");
		MusicGroup group2 = new MusicGroup("P-series","Mumabi");
		
		group.hireMusician(musician);
		group2.hireMusician(musician);
		group.program();
		group2.program();
		
		group = null;
		group2 = null;
		
		musician.perform();
	}
}
