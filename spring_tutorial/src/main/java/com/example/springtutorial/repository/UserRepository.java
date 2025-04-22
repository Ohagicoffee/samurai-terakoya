package com.example.springtutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtutorial.entity.User;

// JpaRepositoryというインタフェースから<テーブル名、一意認識できるキー>を選択している
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//ユーザー名で完全一致検索
	List<User> findByUserName(String userName);
}
