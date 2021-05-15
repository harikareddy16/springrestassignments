package harikaaaa;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import harikaaaaa.User;

@Service
public class UserImpl implements UserService {

	List<User> users;

	public UserImpl() {
		users = new ArrayList<>();
		users.add(new User("harika", "Password123"));
		users.add(new User("krithi", "Password1234"));
		users.add(new User("akanksha", "Password0123"));
		users.add(new User("veer", "Password1023"));
		users.add(new User("sameera", "Password1203"));
		users.add(new User("sam", "Password1230"));
		users.add(new User("ikea", "0Password123"));
		users.add(new User("kevin", "Passw0rd123"));
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
