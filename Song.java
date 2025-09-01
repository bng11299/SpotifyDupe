
package com.gradescope.spotify;
public class Song {
	private String title;
	private String artist;
	private int timesPlayed;
	
	public Song(String title, String artist) {//constructor
		this.title = title;
		this.artist = artist;
		this.timesPlayed = 0;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getTimesPlayed() {
		return timesPlayed;
	}
	
	public void play(){//”play” this song. To play a song, print out a description of the song. The number of times a song has been played should be incremented after playing a song
		System.out.println("Playing " + title + " by " + artist);
		timesPlayed++;
	}
	
	public String toString() {//If the song God’s Plan by Drake has been played 27 times, it should return ”God’s Plan by Drake, 27 play(s)”
		return title + " by " + artist + ", " + timesPlayed + " play(s)";
	}
}
