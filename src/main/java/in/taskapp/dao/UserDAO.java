package in.taskapp.dao;

import java.util.ArrayList;
import java.util.List;

import in.taskapp.model.User;

public class UserDAO {

	private List<User> users = new ArrayList<>();

	
	public void save(User user) {
		users.add(user);
	}
	
}
