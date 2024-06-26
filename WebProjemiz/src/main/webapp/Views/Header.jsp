<%@ page import="Model.urunModel, java.util.*"%>

<!DOCTYPE html>
<html lang="tr">
<head>
<meta charset="ISO-8859-9">
<title>Anasayfa</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css"
	integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz"
	crossorigin="anonymous">
<style>
.menu3 {
    width: 350px;
    height: 700px;
    min-width: 350px;
    max-width: 350px;
    min-height: 700px;
    max-height: 700px;
    position: fixed;
    left: 20px;
    top: 100px;
    background-color: #ffffff;
    z-index: 1;
    /* Diğer özellikler */
    margin: 0; /* Varsa margin sıfırla */
    padding: 0; /* Varsa padding sıfırla */
    /* Gerekirse diğer CSS özelliklerini inceleyin */
    overflow: hidden;
}


.navbar .nav-link {
	color: white;
	font-size: 20px; /* Font büyüklüğü */
	font-family: Arial, sans-serif; /* Font tipi */
}

.navbar .nav-item {
	margin-left: 50px;
}

.search-form {
	display: none; /* Gizli olacak */
}

.search-icon {
	cursor: pointer;
}

.search-icon:hover {
	color: #a31053;
}

.search-bar {
	position: absolute;
	top: 110px; /* Navbar'ın altında */
	right: 30px;
	width: 450px;
	z-index: 1000;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<li class="li1"><a class="aa ab" data-toggle="collapse"
			href="#collapseExample" role="button" aria-expanded="true"
			aria-controls="collapseExample" id="gk">Urunler</a></li>
		<li class="nav-item"><a class="nav-link"
			href="Home.jsp#list-item-4">Hakkimizda</a></li>
		<li class="nav-item"><a class="nav-link"
			href="Home.jsp#list-item-5">Iletisim</a></li>
			<li class="nav-item"><a class="nav-link"
			href="Home.jsp">Anasayfa</a></li>
		
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav mr-auto">




			</ul>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link search-icon"><i
						class="fas fa-search"></i><br>Ara</a></li>
				<% 
                    String cookieName = "username";
                    Cookie[] cookies = request.getCookies();
                    Cookie myCookie = null;
                    if (cookies != null) {
                        for (Cookie cookie : cookies) {
                            if (cookie.getName().equals(cookieName)) {
                                myCookie = cookie;
                                break;
                            } 
                        }
                    }
                    if (myCookie != null && !myCookie.getValue().equals("false")) {
                %>
				<li class="nav-item"><a class="nav-link"
					href="KisiselBilgilerim.jsp"><i class="fas fa-user"></i><br>Hesap</a>
				</li>
				<% } else { %>
				<li class="nav-item"><a class="nav-link" href="uyeGiris.jsp"><i
						class="fas fa-user"></i><br>Hesap</a></li>
				<% } %>
				<% 
                    int urunSayisi = 0;
                    List<urunModel> urunlerim = (List<urunModel>) session.getAttribute("sepet");
                    if (urunlerim != null) {
                        urunSayisi = urunlerim.size();
                    }
                %>
				<li class="nav-item"><a class="nav-link" href="Sepetim.jsp"><i
						class="fas fa-shopping-cart"></i><span class="rounded-circle"
						style="padding: 2px; background-color: #a31053"><%= urunSayisi %></span><br>Sepetim</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container mt-5 pt-5">
		<!-- Arama Formu -->
		<div class="search-bar d-none">
			<form class="form-inline search-form">
				<input class="form-control mr-sm-2 opak1" id="font1" type="search"
					placeholder="Neyi aramistiniz?" aria-label="Search">
				<button style="background-color: #a31053"
					class="btn btn-outline-success my-2 my-sm-0" type="submit">Ara</button>
			</form>
		</div>


	</div>

	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wf"></script>
	<script>
        document.querySelector('.search-icon').addEventListener('click', function() {
            document.querySelector('.search-bar').classList.toggle('d-none');
        });
    </script>
</body>
</html>
