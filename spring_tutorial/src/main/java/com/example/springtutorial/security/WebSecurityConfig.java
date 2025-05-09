package com.example.springtutorial.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//セキュリティ機能に関する設定を行うクラス

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
			//アクセス許可に関する設定
			.authorizeHttpRequests((requests) -> requests
					.requestMatchers("/login", "/resources/**").permitAll() //前ユーザにアクセスを許可するURL。
																			//(/** とパスの末尾につけることでパス配下の全ファイルが対象になる)
					.anyRequest().authenticated() //上記以外のURLはログインが必要(ロールを問わない)
			)
			
			//ログインに関する設定
			.formLogin((form) -> form
					.loginPage("/login")						//ログインページのURL
					.loginProcessingUrl("/login")				//ログインフォームの送信先URL
					.defaultSuccessUrl("/adminuser?loggedIn", true)   //ログイン成功時のリダイレクト先URL
					.failureUrl("/login?error")					//ログイン失敗時のリダイレクト先URL
					.permitAll()
			)
			
			//ログアウトに関する設定
			.logout((logout) -> logout
				.logoutSuccessUrl("/?loggedout")				//ログアウト(が成功したとき)のURL
				.permitAll()
			);
		
		return http.build();
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
