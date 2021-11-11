package com.api.todos.objects;

import static java.util.Objects.hash;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

public class ToDoListVO{
	
	private String userID;
	private List<TodoVO> todos;
	private List<TodoVO> completedTodos;
	private List<TodoVO> deletedTodos;
	
	public ToDoListVO() {
		super();
	}
	
	@Autowired
	public ToDoListVO(String userID, List<TodoVO> todos, List<TodoVO> completedTodos, List<TodoVO> deletedTodos) {
		//super();
		this.userID = userID;
		this.todos = todos;
		this.completedTodos = completedTodos;
		this.deletedTodos = deletedTodos;
	}

	@Override
	public int hashCode() {
		return hash(completedTodos, deletedTodos, todos, userID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDoListVO other = (ToDoListVO) obj;
		return Objects.equals(completedTodos, other.completedTodos) && Objects.equals(deletedTodos, other.deletedTodos)
				&& Objects.equals(todos, other.todos) && Objects.equals(userID, other.userID);
	}

	@Override
	public String toString() {
		return "ToDoListVO [userID=" + userID + ", todos=" + todos + ", completedTodos=" + completedTodos
				+ ", deletedTodos=" + deletedTodos + "]";
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public List<TodoVO> getTodos() {
		return todos;
	}

	public void setTodos(List<TodoVO> todos) {
		this.todos = todos;
	}

	public List<TodoVO> getCompletedTodos() {
		return completedTodos;
	}

	public void setCompletedTodos(List<TodoVO> completedTodos) {
		this.completedTodos = completedTodos;
	}

	public List<TodoVO> getDeletedTodos() {
		return deletedTodos;
	}

	public void setDeletedTodos(List<TodoVO> deletedTodos) {
		this.deletedTodos = deletedTodos;
	}
	
}
