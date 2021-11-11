package com.api.todos.objects;

import java.util.Objects;

public class TodoVO {
	private String id;
	private String todo;
	
	public TodoVO() {
		super();
	}
	
	public TodoVO(String id, String todo) {
		super();
		this.id = id;
		this.todo = todo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, todo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoVO other = (TodoVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(todo, other.todo);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}
	
	
	
}
