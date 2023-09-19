package com.eureka.client.jpa.clienttoclient.feignservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.eureka.client.jpa.clienttoclient.model.User;

@FeignClient(name = "eureka-client-jpa")
public interface EurekaClientJpaClientToClientFeignService {


	@PostMapping(value = "/api/createuser")
	public User createUser(@RequestBody  User user) ;
	
	@GetMapping(value = "api/byname/{username}")
	public List<User> getUsersByName(String username);
	
	


}
