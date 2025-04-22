package com.example.springtutorial.controller;

import org.springframework.stereotype.Controller;
 
@Controller
public class AuthController {
	public String login() {
		
		//ログイン画面のビューを表示
		return "auth/login";
	}
}
