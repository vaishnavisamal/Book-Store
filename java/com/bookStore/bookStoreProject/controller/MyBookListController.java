package com.bookStore.bookStoreProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookStore.bookStoreProject.service.MyBookListService;

@Controller
public class MyBookListController {

	@Autowired
	private MyBookListService ser;
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		ser.deleteById(id);
		return "redirect:/my_books";
	}
}
