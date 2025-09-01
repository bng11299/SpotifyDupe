
package com.gradescope.spotify;
import java.util.Map;
import java.util.TreeMap;

public class UserCollection {
	private Map<String, User> users;
	
	public UserCollection() {
		users = new TreeMap<>();
	}
	
	public boolean userExists(String username) {
		return users.containsKey(username);
	}
	
	public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.attemptLogin(password)) {
            return user;
        }
        return null;
    }
	
	public void addUser(User add) {
        if (add != null && !userExists(add.getName())) {
            users.put(add.getName(), add);
        }
    }
	
	/*if there
	are two users (tconklin, cjenkins) both with 0 playlists, toString() should return ”{
	cjenkins: 0 playlists, tconklin: 0 playlists, }”. Users must be printed in alphabetical
	order by username
	*/
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (User user : users.values()) {
            sb.append("  ").append(user.toString()).append(",\n");
        }
        sb.append("}");
        return sb.toString();
    }
	
}
