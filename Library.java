
package com.gradescope.spotify;
import java.util.Map;
import java.util.TreeMap;

public class Library {
	private Map<String, Song> songs;
	
	public Library() {//constructor
		songs = new TreeMap<>();
	}
	
	public Song getSong(String title){
		return songs.get(title);
	}
	
	public void addSong(Song song) {
		if(song != null) {
			songs.put(song.getTitle(), song);
		}
	}
	
	public void removeSong(Song song) {
		if(song != null) {
			songs.remove(song.getTitle());
		}
	}
	
	/*returns a string representation of this library. The format
	requires that the string representation of each song appear on its own line. You will add
	the string representation of a song, then a newline for each song. Songs must be printed
	in alphabetical order by song name
	*/
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Song song : songs.values()) {
            sb.append(song.toString()).append("\n");
        }
        return sb.toString();
	}
}
