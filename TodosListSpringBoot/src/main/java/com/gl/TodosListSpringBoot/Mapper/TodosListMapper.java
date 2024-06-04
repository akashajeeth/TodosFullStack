package com.gl.TodosListSpringBoot.Mapper;

import com.gl.TodosListSpringBoot.Model.TodosList;
import com.gl.TodosListSpringBoot.dto.TodosListDto;

public class TodosListMapper {
	public static TodosListDto mapToTodosListDto(TodosList todosList) {
		return new TodosListDto(
				todosList.getId(),
				todosList.getTodoTitle(),
				todosList.getTodoDescription(),
				todosList.getTodoCompleted()
				);
	}
	
	public static TodosList mapToTodosList(TodosListDto todosListDto) {
		return new TodosList(
				todosListDto.getId(),
				todosListDto.getTodoTitle(),
				todosListDto.getTodoDescription(),
				todosListDto.getTodoCompleted()
				);
				
	}

}
