package acs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import acs.logic.EnhancedCategoriesService;

@RestController
public class AdminController {
	
	private EnhancedCategoriesService enhancedUserService;
	
	@Autowired
	public AdminController(EnhancedCategoriesService enhancedUserService) {
		this.enhancedUserService = enhancedUserService;
	}
	
	/*--------------------- DELETE APIS ------------------- */

	@RequestMapping(path = "/users",
			method = RequestMethod.DELETE)
	public void deleteAllUsers() {
		this.enhancedUserService.deleteAllUsers();
	}

}
