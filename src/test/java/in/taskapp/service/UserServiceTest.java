package in.taskapp.service;

import in.taskapp.model.User;

public class UserServiceTest {

	private static UserService userService = new UserService();
	
	public static void main(String[] args) {

		
		User user = new User();
		user.setId(1);
		user.setName("Naresh");
		user.setEmail("n@gmail.com");
		user.setPassword("pass123");
		
		userService.addUser(user);
		
	}

}
