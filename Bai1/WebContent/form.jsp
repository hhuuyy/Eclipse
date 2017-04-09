<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome to Nhat Nghe</title>
<link rel="stylesheet" type="text/css"  href="css/style.css">
</head>
<body>
	<h1>Form nhập</h1>
	<h4>${fullname}</h4>
	<form action="user.php">
		<ul class="form-style-1">
			<li>
				<label>Họ và tên:</label>
				<input type="text" name="hoten"/>
				<input type="submit" value="OK" />
			</li>
		</ul>
	</form>
</body>
</html>