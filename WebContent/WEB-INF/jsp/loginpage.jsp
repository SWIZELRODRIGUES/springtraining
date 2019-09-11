<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="/menu.jsp"/> 

	<form action="login.do" method="post">
		<h1>HEY</h1>
		<p>
			Login <input type="text" name="login" />
		</p>
		<p>
			Password <input type="password" name="password" />
		</p>
		<p>
			<input type="submit" name="next" />
		</p>
		<p>${error }</p>
	</form>
</body>
</html>