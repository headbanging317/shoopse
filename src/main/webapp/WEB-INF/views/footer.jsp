<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cPath=(String)request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/footer.css" type="text/css" media="screen">
<style>
	#footer {
		    position: absolute;
bottom: 0;
left: 0;
right: 0;
	}
	html {
		height: 100%;
	}
	
	body {
		margin: 0;
		height: 100%;
	}
	.contentArea {
		min-height: 100%;
		position: relative;
		padding-bottom: 50px;
	}
</style>
</head>
<body>
<div class="contentArea">
	

<footer id="footer">
		<div class=footer-top></div>

		<div class=footer-bottom>
			<ul>
				<li>대표: 에이콘아카데미</li>
				<li>주소: 동아빌딩15F</li>
				<li>ⓒ 2017. Acorn all rights reserved.</li>
				<li>Copyright(c)2017 by Acorn. All Page content is property of Acorn</li>
				<li>Copyright(c)2017 by Acorn. All pictures cannot be copied without permission. </li>
			</ul>
		</div>
</footer>
	</div>
</body>
</html>