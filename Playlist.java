package com.gradescope.spotify;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String name;
	private List<Song> songs;
	
	public Playlist(String name) {
		this.name = name;
		this.songs = new ArrayList<>();
	}
	
	public Playlist(String name, List<Song> contents) {
		this.name = name;
		this.songs = new ArrayList<>(contents);
	}
	
	public String getName() {
		return name;
	}
	
	public void addSong(Song song) {
		if (song != null) {
			songs.add(song);
		}
	}
	
	public void removeSong(Song song) {
		songs.remove(song);
	}
	
	public void play() {
		for(Song song:songs) {
			song.play();
		}
	}

}
