package com.example.springtutorial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity //クラスをエンティティとして機能させる
@Table(name = "users") //クラスにデータベースのテーブルを紐づける
@Data //Lombokでゲッターやセッターなどを自動生成する
public class User {
	@Id //一意認識の主キーを表す
	@GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.IDENTITYとつくと、そのカラムはAUTO_INCREMENTと同等の処理になる
	@Column(name = "user_id") //フィールドにデータベースのカラムを紐づける
	private Integer userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "role_id")
	private Integer roleId;
	
}
