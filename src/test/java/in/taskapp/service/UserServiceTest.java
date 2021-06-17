package in.taskapp.service;

import in.taskapp.exception.ServiceException;
import in.taskapp.model.User;

public class UserServiceTest {

	private static UserService userService = new UserService();
	
	public static void main(String[] args) {

		
		User user = new User();
		user.setId(1);
		user.setName("n");
		user.setEmail("n");
		user.setPassword("  ");
		
		try {
			userService.addUser(user);
			System.out.println("Success");
		} catch (ServiceException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	}

}
