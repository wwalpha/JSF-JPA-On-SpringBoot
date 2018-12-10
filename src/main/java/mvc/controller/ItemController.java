package mvc.controller;

import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;

import mvc.service.ItemService;

//import mvc.jpa.ItemService;

@RequestScoped
public class ItemController {

	@Autowired
	private ItemService itemService;

	public String search() {
		return "Hello from PrimeFaces and Spring Boot!";
	}
}
