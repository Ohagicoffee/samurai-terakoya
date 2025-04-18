package com.example.springkadaitodo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;

@Service
public class ToDoService {
	private final ToDoRepository toDoRepository;
	
	
	//依存性の注入をする(コンストラクタインジェクション)
	public  ToDoService(ToDoRepository toDoRepository) {
		this.toDoRepository = toDoRepository;
	}
			
	//新規toDoの読み取りメソッド
	public void readToDo(int id, String title, String priority, String status) {
		
		//toDの登録用のエンティティを作成
		ToDo toDo = new ToDo();
		
		toDo.setTitle(title);
		toDo.setPriority(priority);
		toDo.setStatus(status);
		
		toDoRepository.save(toDo);
	}
	
	public List<ToDo> getAllToDo() {
		return toDoRepository.findAll();
	}
	
}
