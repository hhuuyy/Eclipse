<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome to Nhat Nghe</title>
<link rel="stylesheet" type="text/css"  href="css/style.css">
<link rel="icon" href="" />
</head>
<body>
	<h1>Bonus 10%</h1>
	<form action="bonus.php">
		<ul class="form-style-1">
			<li>
				<label>Họ và tên</label>
				<input type="text" name="hoten" value="${param.hoten}" />
			</li>
			<li>
				<label>Lương</label>
				<input type="number" name="luong" value="${param.luong}" />
			</li>
			<li>
				<input type="submit" value="Thưởng" />
			</li>
		</ul>
	</form>
	<h3>Họ và tên: ${hoten}</h3>
	<h3>Lương: ${luong} --> Thưởng: 10% = ${thuong}</h3>
</body>
</html>