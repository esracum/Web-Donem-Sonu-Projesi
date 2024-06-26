<!DOCTYPE html>
<html lang="tr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Kullanıcı Bilgileri</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<style>
body {
	font-family: 'Roboto', sans-serif;
	background-color: #800080;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 400px;
	margin: 50px auto;
	padding: 20px;
	background-color:#800080 ;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius: 8px;
}

h1 {
	text-align: center;
	font-family: 'Playfair Display', serif;
	margin-bottom: 20px;
}

form {
	display: flex;
	flex-direction: column;
}

.form-group {
	margin-bottom: 10px;
}

.form-group label {
	font-weight: bold;
	margin-bottom: 5px;
	display: block;
}

.form-group input, .form-group textarea {
	width: 100%;
	padding: 8px;
	border: 1px solid #ced4da;
	border-radius: 5px;
	font-size: 14px;
}

.form-group input[type="submit"] {
	background-color: #800080;
	color: white;
	border: none;
	cursor: pointer;
}

.form-group input[type="submit"]:hover {
	background-color:#800080;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Kullanici Bilgileri</h1>
		<form action="kullaniciekle.jsp" method="post">
			<div class="form-group">
				<label for="kullaniciAdi">Kullanici Adi</label> <input type="text"
					id="kullaniciAdi" name="kullaniciAdi" required>
			</div>
			<div class="form-group">
				<label for="sifre">Sifre</label> <input type="password" id="sifre"
					name="sifre" required>
			</div>
			<div class="form-group">
				<label for="ad">Ad</label> <input type="text" id="ad" name="ad"
					required>
			</div>
			<div class="form-group">
				<label for="soyad">Soyad</label> <input type="text" id="soyad"
					name="soyad" required>
			</div>
			<div class="form-group">
				<label for="telefon">Telefon</label> <input type="text" id="telefon"
					name="telefon" required>
			</div>
			<div class="form-group">
				<label for="mail">Mail</label> <input type="email" id="mail"
					name="mail" required>
			</div>
			<div class="form-group">
				<label for="sehir">Sehir</label> <input type="text" id="sehir"
					name="sehir" required>
			</div>
			<div class="form-group">
				<label for="ilce">Ilce</label> <input type="text" id="ilce"
					name="ilce" required>
			</div>
			<div class="form-group">
				<label for="adres">Adres</label>
				<textarea id="adres" name="adres" rows="4" required></textarea>
			</div>
			<div class="form-group">
				<input type="submit" value="Gonder">
			</div>
		</form>
	</div>
</body>
</html>
