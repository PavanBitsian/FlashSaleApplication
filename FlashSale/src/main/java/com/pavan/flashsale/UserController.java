package com.pavan.flashsale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//When clicked on Register button, we need to send email and register flag. Assuming that user has to register only for flash sale rather than specific model
@RestController
public class UserController {
	
	List<User> registeredUsers = new ArrayList<>(Arrays.asList(new User("pavan29275@gmail.com",true)));
	
	@RequestMapping("/Users")
	public List<User> getRegisteredUsers() {
		
	    return registeredUsers;
	}
		
	@RequestMapping(method=RequestMethod.POST,value="/Register")
	public void registerUser(@RequestBody User user) {
	    registeredUsers.add(user);
	}

}
