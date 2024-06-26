<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>adminPaneli</title>

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<!-- Font Awesome CSS -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css"
	integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz"
	crossorigin="anonymous">

<style>
/* Genel stil tanımlamaları */
body {
	font-family: Arial, sans-serif;
	background-color: #fff6f9;
	padding: 0;
}

.nava {
	width: 100%;
	padding: 10px;
}

.ul1 {
	list-style-type: none;
	padding: 0;
	margin: 0;
}

.ul1 li {
	display: inline-block;
	margin-right: 20px; /* Boşluk miktarı ayarlanabilir */
}

.ul1 li a {
	color: #4b0082; /* Koyu mor renk */
	text-decoration: none; /* Bağlantı alt çizgisini kaldır */
	padding: 10px; /* Bağlantı içi boşluk */
}

.ul1 li a:hover {
	background-color: #6a5acd; /* Gölgeli orta mor */
	border-radius: 15px; /* Köşe yuvarlama */
	color: #fff; /* Beyaz metin rengi */
}

.alert.opak2 {
	/* Başlık arka plan rengi */
	color: #4b0082; /* Koyu mor metin */
	padding: 10px; /* Başlık içi boşluk */
	margin-top: 0px; /* Başlık üst boşluk */
}
</style>

</head>

<body>

	<div class="alert" style="background-color: #FFB6C1; opacity: 0.8;font-size: 20px;">
		<nav class="navbar navbar-light"></nav>

		<div class="alert bg-pink opak2">
			<ul class="ul1 ml-2">
				<li><b><a href="#list-item-1" class="aa ab">Musteriler</a></b></li>
				<li><b><a href="#list-item-2" class="aa ab">Kategoriler</a></b></li>
				<li><b><a href="#list-item-3" class="aa ab">Urunler</a></b></li>
				<li><b><a href="#list-item-4" class="aa ab">Siparisler</a></b></li>
				<li><b><a href="#list-item-5" class="aa ab">Adminler</a></b></li>
				<li><b><a href="adminCikis.jsp" class="aa ab">Cikis Yap</a></b></li>
			</ul>
		</div>
	</div>

	<div class="scrollspy-example mt-3">
		<%@ include file="musteriler.jsp"%>
		<%@ include file="kategoriler.jsp"%>
		<%@ include file="aUrun.jsp"%>
		<%@ include file="aSiparisler.jsp"%>
		<%@ include file="yoneticiler.jsp"%>
	</div>

	<!-- JavaScript ve diğer bağımlılıklar -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>


	</div>


</body>

</html>
