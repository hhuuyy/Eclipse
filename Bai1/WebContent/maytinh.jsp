<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome to Nhat Nghe</title>
<link rel="stylesheet" type="text/css"  href="css/style.css">
</head>
<body>
<h1>Máy tính</h1>
<form action="calculate.php">
	<ul class="form-style-1">
		<li>
			A: <input type="text" name="a" value="${param.a}"/><br>
			B: <input type="text" name="b" value="${param.b }"/><br>
		</li>
		<li>
			<input type="submit" value="Tổng" />
		</li>
	</ul>
</form>
<h4>Tổng: <span>${param.a} + ${param.b} = ${tong} </span></h4>
</body>
</html>