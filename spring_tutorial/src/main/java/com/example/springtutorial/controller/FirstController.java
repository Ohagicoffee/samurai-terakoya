package com.example.springtutorial.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FirstController {
	@GetMapping("/")  //トップページにアクセスするときにfirst()が呼び出される
	public String first() {
		return "firstView";  //ビュー名の拡張子(.html)は省略可能
		
	}
}
