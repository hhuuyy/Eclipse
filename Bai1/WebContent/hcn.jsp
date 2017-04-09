<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome to Nhat Nghe</title>
<link rel="stylesheet" type="text/css"  href="css/style.css">
</head>
<body>
<h1>Tính tổng và diện tích HCN</h1>
<form action="hcn.php">
	<ul class="form-style-1">
		<li>
			Chiều dài: <br><input type="text" name="cd" value="${param.cd}"><br>
			Chiều rộng:<br><input type="text" name="cr" value="${param.cr}">
			<input type="submit" value="Tinh" />
		</li>
	</ul>
</form>
<h2>Chu vi: ${chuvi}</h2>
<h2>Diện tích: ${dientich}</h2>
</body>
</html>