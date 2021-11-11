package com.api.todos.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bson.BsonDocument;
import org.bson.conversions.Bson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.todos.objects.ToDoListVO;
import com.api.todos.service.TodosService;
import com.mongodb.client.result.InsertOneResult;



@RestController
@RequestMapping("/todos")
public class TodosController {
	
	
	//add to-do
	//complete to-do
	//
	
	@PostMapping("/")
	@Produces(MediaType.APPLICATION_JSON)
	public InsertOneResult addTodosTodo(@RequestBody ToDoListVO todosLists) {
		
		TodosService service = new TodosService();
		
		System.out.println("Controller " + todosLists.toString());
		return service.addTodos(todosLists);
	}
		
	
}
