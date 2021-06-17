package in.taskapp.service;

import in.taskapp.dao.UserDAO;
import in.taskapp.model.User;

public class UserService {

	private UserDAO userDAO = new UserDAO();
	
	public void addUser(User user) {
		userDAO.save(user);
	}
}
