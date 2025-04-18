package com.example.springkadaitodo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springkadaitodo.entity.ToDo;

//JpaRepositoryインターフェースを使用してエンティティとサービスの橋渡しをする
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

	//タイトルで完全一致検索
	List<ToDo> findByTitle(String title);
}
