<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>

<html>
	<head>
		<title>確認画面</title>
	</head>
	<body>
		<h2>入力内容をご確認ください。</h2>
		<p>問題なければ「確定」、修正する場合は「キャンセル」をクリックしてください。</p>
		
		<table border="1">
			<tr>
				<th>項目</th>
				<td>入力内容</td>
			</tr>
			<tr>
				<th>氏名</th>
				<td>${ name }</td>
			</tr>
			<tr>
				<th>メールアドレス</th>
				<td>${ email }</td>
			</tr>
			<tr>
				<th>住所</th>
				<td>${ address }</td>
			</tr>
			<tr>
				<th>電話番号</th>
				<td>${ phone_number }</td>
			</tr>
		</table>
		
		<button onclick="location.href='<%=request.getContextPath() %>/complete';">確定</button>
		
		<%--キャンセルの場合はformPage.jspへ画面遷移 --%>
		<button onclick="history.back();">キャンセル</button>
	</body>


</html>