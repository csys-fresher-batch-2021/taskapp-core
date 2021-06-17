package in.taskapp.service;

import in.taskapp.dao.UserDAO;
import in.taskapp.exception.ServiceException;
import in.taskapp.model.User;

public class UserService {

	private UserDAO userDAO = new UserDAO();
	
	public void addUser(User user) throws ServiceException {
		
		if (user.getName() == null  || "".equals(user.getName().trim())){
			throw new ServiceException("Invalid Name");
		}
		else if (user.getEmail() == null  || "".equals(user.getEmail().trim())){
			throw new ServiceException("Invalid Email");
		}
		else if (user.getPassword() == null  || "".equals(user.getPassword().trim())){
			throw new ServiceException("Invalid Password");
		}
		
		userDAO.save(user);
	}
}
