package com.example.springtutorial.controller;

import java.util.List;

import org.springframework.core.Conventions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.springtutorial.entity.User;
import com.example.springtutorial.form.UserRegisterForm;
import com.example.springtutorial.service.UserService;

@Controller
public class AdminUserController {
	
	//コンストラクタインジェクションを取り扱うためにフィールド定義
	private final UserService userService;
	
	public AdminUserController(UserService userService) {
		this.userService = userService;
	}
	
	//adminUserViewとモデルを紐づける
	@GetMapping("/adminuser") 
	public String adminUser(Model model) {
		
		//最新のユーザリストを取得
		List<User> users = userService.getAllUsers();
		
		//ビューにユーザリストを渡す
		model.addAttribute("users", users);
		
		//フォームクラスにてデータが重複するならば行わない
		if(!model.containsAttribute("userRegisterForm")) {
			
			//ビューにフォームクラスのインスタンスを渡す
			model.addAttribute("userRegisterForm", new UserRegisterForm());
		}
		
		return "adminUserView";
	}
	
	@PostMapping("/register")
	public String registerUser(RedirectAttributes redirectAttributes, 
			@Validated UserRegisterForm form, BindingResult result ) {
		
		//バリデーションエラーがあったら終了
		if(result.hasErrors()) {
			//フォームクラスをビューに受け渡す
			redirectAttributes.addFlashAttribute("userRegisterForm", form);
			
			//バリデーション結果をビューに受け渡す
			redirectAttributes.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX +
					Conventions.getVariableName(form), result);
		}
		
		try {
			//フォームからのデータを用いてユーザ登録
			userService.createUser(form.getUserName(), form.getPassword(), form.getRoleId());
			
			//登録成功時は完了メッセージをビューに受け渡す
			redirectAttributes.addFlashAttribute("successMessage", "ユーザ登録が完了しました");
			
		} catch (IllegalArgumentException e) {
			
			//登録失敗時はエラーメッセージをビューに受け渡す
			redirectAttributes.addFlashAttribute("failureMessage", e.getMessage());
			
			//再表示用の入力データをビューに受け渡す(パスワードは除外)
			redirectAttributes.addFlashAttribute("userRegisterForm", form);
			
		}
		
		//adminuserにリダイレクトしてリストを再表示
		return "redirect:/adminuser";
	}
	
}
