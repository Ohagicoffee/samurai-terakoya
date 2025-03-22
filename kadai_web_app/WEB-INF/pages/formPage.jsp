<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.util.Objects" %>

<html>
	<head>
		<title>入力フォーム</title>
	</head>
	<body>
		<h2>個人情報入力フォーム</h2>
		<%--ConfirmServletへの画面遷移(POSTメソッド) --%>
		<form action="<%=request.getContextPath() %>/confirm" method="post">
			<table>
				<tr>
					<th>氏名</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr>
				
				<tr>
					<th>メールアドレス</th>
					<td>
						<input type="text" name="email">
					</td>
				</tr>
				
				<tr>
					<th>住所</th>
					<td>
						<input type="text" name="address">
					</td>
				</tr>
				
				<tr>
					<th>電話番号</th>
					<td>
						<input type="text" name="phone_number">
					</td>
				</tr>
			</table>
			<input type="submit" value="送信">
		</form>
	</body>
	
</html>