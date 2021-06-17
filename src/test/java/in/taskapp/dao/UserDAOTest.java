package in.taskapp.dao;

import in.taskapp.model.User;

public class UserDAOTest {

	private static UserDAO userDAO = new UserDAO();
	
	public static void main(String[] args) {

		
		User user = new User();
		user.setId(1);
		user.setName("Naresh");
		user.setEmail("n@gmail.com");
		user.setPassword("pass123");
		
		userDAO.save(user);
		
	}

}
