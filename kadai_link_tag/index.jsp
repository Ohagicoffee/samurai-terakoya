<%-- コンテンツタイプを指定 --%>
<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ page pageEncoding = "UTF-8" %>

<html>
	<head>
		<title>Servletからのメッセージを表示しよう</title>
	</head>
	<body>
		<%--GETメソッド送信リンク --%>
		<a href= "<%= request.getContextPath() %>/link?name=侍太郎">名前「侍太郎」をServletに送信</a>
		
		<%-- リクエストスコープからデータを取得 --%>
		<%
		String name = (String)request.getAttribute("shownName");
		%>
		
		<%--　データが存在する場合に表示 --%>
		<% if(name != null) { %>
			<p><%= name %></p>
		<% } %>
	</body>
</html>