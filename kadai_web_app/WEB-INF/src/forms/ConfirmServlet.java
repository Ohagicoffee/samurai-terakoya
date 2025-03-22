package forms;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConfirmServlet extends HttpServlet {
	//入力フォームの送信ボタン押下時
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		//リクエスト・レスポンスの設定
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		//formPage.jspから受け取ったデータを取得
		String name = request.getParameter("name"); //氏名
		String email = request.getParameter("email"); //メールアドレス
		String address = request.getParameter("address"); //住所
		String phoneNum = request.getParameter("phone_number"); //電話番号
		
		//上記変数をリクエストスコープに保存
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("address", address);
		request.setAttribute("phone_number", phoneNum);
		
		//データが存在しない場合は空文字に置き換え
		name = Objects.toString("", name);
		email = Objects.toString("", email);
		address = Objects.toString("", address);
		phoneNum = Objects.toString("", phoneNum);
		
		//confirmPage.jspへ画面遷移
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/confirmPage.jsp");
		dispatcher.forward(request, response);
	}
}
