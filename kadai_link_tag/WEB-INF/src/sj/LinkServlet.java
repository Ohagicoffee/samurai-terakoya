package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		//リクエスト・レスポンスの設定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		//index.jspからのデータ取得
		String name = request.getParameter("name");
		
		//Servletからのメッセージを付加
		String message = "Servletからデータを受信しました："+ name + "さん、こんにちは！";
		name = message;
		
		//リクエストスコープにデータを保存
		request.setAttribute("shownName", name);
		
		//index.jspに画面遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}
}
