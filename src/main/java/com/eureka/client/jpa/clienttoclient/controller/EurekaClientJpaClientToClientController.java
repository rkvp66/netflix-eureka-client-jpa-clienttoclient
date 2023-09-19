package com.eureka.client.jpa.clienttoclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.jpa.clienttoclient.feignservice.EurekaClientJpaClientToClientFeignService;
import com.eureka.client.jpa.clienttoclient.model.User;

@RestController
@RequestMapping(value = "/api")
public class EurekaClientJpaClientToClientController {
	@Autowired
	EurekaClientJpaClientToClientFeignService feignService;

	@PostMapping(value = "/createuser")
	public User createUser(@RequestBody  User user) {
		return feignService.createUser(user);
	}
	
	@GetMapping(value = "/byname/{username}")
	public List<User> users (@PathVariable String username){
		return feignService.getUsersByName(username);
	}

}
