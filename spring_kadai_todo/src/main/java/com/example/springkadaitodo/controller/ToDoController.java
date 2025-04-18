package com.example.springkadaitodo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {

	//コンストラクタインジェクションを取り扱うためにフィールド定義
	private final ToDoService toDoService;
	
	public ToDoController(ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	//todoView.htmlと紐づける
	@GetMapping("/todo")
	public String toDo(Model model) {
		
		//最新のtodoリストを取得
		List<ToDo> todos = toDoService.getAllToDo();
		
		model.addAttribute("todos", todos);
		
		return "toDoView";
	}
	
}
