<div id="carouselExampleFade" class="carousel slide carousel-fade nav2"
	data-ride="carousel">
	<style>
.carousel-item img {
	display: block;
	margin-left: -550px;
	margin-right: auto;
}

.carousel-thumb {
	width: 450px; /* Küçük kutucuk genişliği */
	height: 450px; /* Küçük kutucuk yüksekliği */
	object-fit: cover; /* Resmin kutucuğa sığması için */
	margin: auto; /* Ortalamak için */
}

.featured-carousel-inner {
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
}

.featured-carousel-item {
	flex: 0 0 450px; /* Kutucuk genişliği kadar esnek olmasını sağlar */
	margin: 0px; /* Kutucuklar arasına boşluk ekler */
}

.carousel-control-prev, .carousel-control-next {
	/* Buton arka plan rengini koyu yapar */
	width: 50px; /* Buton genişliği */
	height: 50px; /* Buton yüksekliği */
	border-radius: 50%; /* Butonları yuvarlak yapar */
	position: absolute; /* Butonları konumlandırmak için */
	top: 60%; /* Butonları biraz daha aşağıya çeker */
	transform: translateY(-30%);
	/* Butonların dikeyde ortalanmasını sağlar */
	display: flex; /* İçeriği ortalamak için */
	align-items: center; /* İçeriği dikeyde ortalamak için */
	justify-content: center; /* İçeriği yatayda ortalamak için */
	z-index: 10; /* Butonların resimlerin üstünde görünmesini sağlar */
}

.carousel-control-prev {
	left: 10px; /* Sol butonu konumlandırır */
}

.carousel-control-next {
	right: 10px; /* Sağ butonu konumlandırır */
}

.carousel-control-prev-icon, .carousel-control-next-icon {
	filter: invert(1); /* İkon rengini beyaz yapar */
	width: 20px; /* İkon genişliği */
	height: 20px; /* İkon yüksekliği */
}

.carousel-control-prev:hover, .carousel-control-next:hover {
	background-color: rgba(0, 0, 0, 0.3);
	/* Hover durumunda buton arka plan rengini daha koyu yapar */
}

.carousel-img {
	margin-top: -20px;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	
}
</style>

	<div class="carousel-inner"></div>

	<!-- One Cikan Urunler carousel'i -->
	<div class="container my-5">
		<h2 class="text-center mb-4">2024 Yaz Sezonu Cok Satanlar </h2>
		<div id="carouselExampleControls" class="carousel slide"
			data-ride="carousel">
			<div class="carousel-inner featured-carousel-inner">
				<div class="carousel-item active featured-carousel-item">
					<img src="img/bilek1.jpg" class="d-block w-100 carousel-thumb"
						alt="Bileklik 1">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/bilek2.jpg" class="d-block w-100 carousel-thumb"
						alt="Bileklik 2">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/bilek3.jpg" class="d-block w-100 carousel-thumb"
						alt="Bileklik 3">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/bilek4.jpg" class="d-block w-100 carousel-thumb"
						alt="Bileklik 4">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/bilek5.jpg" class="d-block w-100 carousel-thumb"
						alt="Bileklik 5">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/kolye1.jpg" class="d-block w-100 carousel-thumb"
						alt="Kolye 1">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/kolye2.jpg" class="d-block w-100 carousel-thumb"
						alt="Kolye 2">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/kolye3.jpg" class="d-block w-100 carousel-thumb"
						alt="Kolye 3">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/kupe1.jpg" class="d-block w-100 carousel-thumb"
						alt="Küpe 1">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/kupe2.jpg" class="d-block w-100 carousel-thumb"
						alt="Küpe 2">
				</div>
				<div class="carousel-item featured-carousel-item">
					<img src="img/kupe3.jpg" class="d-block w-100 carousel-thumb"
						alt="Küpe 3">
				</div>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleControls"
				role="button" data-slide="prev"> <span
				class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#carouselExampleControls"
				role="button" data-slide="next"> <span
				class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>
</div>
