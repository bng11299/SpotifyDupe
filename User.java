package com.gradescope.spotify;
import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String password;
	private List<Playlist> playlists;
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.playlists = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public Boolean attemptLogin(String password) {
		if (this.password.equals(password)) return true;
		else return false;
	}
	
	public void addPlaylist(Playlist newPlaylist) {
		if(newPlaylist != null) {
			playlists.add(newPlaylist);
		}
	}
	
	public List<Playlist> getPlaylists(){
		return playlists;
	}
	
	public void selectPlaylist(String name) {
		for (Playlist p : playlists) {
            if (p.getName().equals(name)) {
                p.play();
                return;
            }
        }
	}
	
	public String toString() {//cjenkins has 12 playlists, this method would return ”cjenkins, 12 playlists”
		return name + ", " + playlists.size() + " playlists";
	}

}
