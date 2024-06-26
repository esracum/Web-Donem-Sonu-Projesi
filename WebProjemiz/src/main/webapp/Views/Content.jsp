  
 <%@page import ="Controller.urunController,Model.urunModel,java.util.*"%>


<%	
		urunController ozelUrun=new urunController();
		
%>



    <div data-spy="scroll" data-target="#list-example" data-offset="0" class="scrollspy-example mt-3">


        
       
        <hr>

        <div class=" row" style="width: 100%;background-image:url(/img/anasayfa.png)">


            <div class="col-2"></div>
            <div class="col-10">
				<%
							List<urunModel> urunler=ozelUrun.ozelKategori(1);
							
							for(urunModel urun:urunler){
								%>
								<div class="card mt-2 ml-4 mb-3 hover12" id="<%=urun.getUrunKodu() %>" style="width: 16rem;float: left">
			                    <img src="../img/<%=urun.getFotograf()%>" class="card-img-top" alt="...">
			                    <div class="card-body">
			                        <h5 class="card-title"><%=urun.getUrunAdi() %></h5>
			                        <p class="card-text"><%=urun.getUrunDetay() %></p>
			                        <span><%=urun.getUrunFiyat() %></span>
			                        <a href="homeUrun.jsp?urunKodu=<%=urun.getUrunKodu()%>&urunFotograf=<%=urun.getFotograf()%>&urunAdi=<%=urun.getUrunAdi()%>&urunFiyati=<%=urun.getUrunFiyat()%>" class="btn btn-success float-right"><span><img src="../img/sepet.png" alt="" style="width: 25px" class="mr-1"></span>Sepete Ekle</a>
			                    </div>
			                </div>
							<%}

				%>
                

                

                

                



           
            </div>
        </div>


    

        

        <div class="row" style="width: 100% ;background-image: url(img/az.jpg)">
            <div class="col-2"></div>
            <div class="col-10">
<%
							List<urunModel> urunler2=ozelUrun.ozelKategori(2);
							
							for(urunModel urun:urunler2){
								%>
								<div class="card mt-2 ml-4 mb-3 hover12" id="<%=urun.getUrunKodu() %>" style="width: 16rem;float: left">
			                    <img src="../img/<%=urun.getFotograf()%>" class="card-img-top" alt="...">
			                    <div class="card-body">
			                        <h5 class="card-title"><%=urun.getUrunAdi() %></h5>
			                        <p class="card-text"><%=urun.getUrunDetay() %></p>
			                        <span><%=urun.getUrunFiyat() %></span>
			                        <a href="homeUrun.jsp?urunKodu=<%=urun.getUrunKodu()%>&urunFotograf=<%=urun.getFotograf()%>&urunAdi=<%=urun.getUrunAdi()%>&urunFiyati=<%=urun.getUrunFiyat()%>" class="btn btn-success float-right"><span><img src="../img/sepet.png" alt="" style="width: 25px" class="mr-1"></span>Sepete Ekle</a>
			                    </div>
			                </div>
							<%}

				%>




            </div>
        </div>



      

        
        


        <div class=" row" style="width: 100% ;background-image: url(../img/koyfoto.jpg)">
            <div class="col-2"></div>
            <div class="col-10">

                
                <%
							List<urunModel> urunler3=ozelUrun.ozelKategori(3);
							
							for(urunModel urun:urunler){
								%>
								<div class="card mt-2 ml-4 mb-3 hover12" id="<%=urun.getUrunKodu() %>" style="width: 16rem;float: left">
			                    <img src="../img/<%=urun.getFotograf()%>" class="card-img-top" alt="...">
			                    <div class="card-body">
			                        <h5 class="card-title"><%=urun.getUrunAdi() %></h5>
			                        <p class="card-text"><%=urun.getUrunDetay() %></p>
			                        <span><%=urun.getUrunFiyat() %></span>
			                        <a href="homeUrun.jsp?urunKodu=<%=urun.getUrunKodu()%>&urunFotograf=<%=urun.getFotograf()%>&urunAdi=<%=urun.getUrunAdi()%>&urunFiyati=<%=urun.getUrunFiyat()%>" class="btn btn-success float-right"><span><img src="../img/sepet.png" alt="" style="width: 25px" class="mr-1"></span>Sepete Ekle</a>
			                    </div>
			                </div>
							<%}

				%>

              
            </div>
        </div>



        <div class="alert alert-secondary mt-2" role="alert">
            <h4 id="list-item-4" class="ml-4 ">Hakkimizda</h4>
        </div>
        <hr>
        <div class="row" style="width: 100%; background-image: url(../img/aaq.jpg)">

            <div class="col-3"></div>
            <div class="col-6" style="height: 600px;margin-top: 100px;">
               <p><p><b>Kimiz?</p></b>
               YES Taki, 2021 yilinda kurulan ve her biri ozenle tasarlanmis el yapimi takilar sunan bir markadir. 
               Geleneksel el isciligini modern tasarimlarla bulusturarak, her tarza hitap eden ozel parcalar yaratiyoruz.

               <p><p><b>Amacimiz</p></b>
               Musterilerimizin kendilerini ozel hissetmelerini saglayacak takilar sunmak.
               Kaliteli ve sik urunlerimizle, sizlere en iyi hizmeti vermek icin buradayiz.
               
               <p><p><b>Degerlerimiz</p></b>
               
               <b>Kalite:</b> Urunlerimizin her biri en yuksek kalite standartlarina uygundur.<br>
               <b>Ozgunluk:</b> Tasarimlarimiz, sizin tarzinizi ve kisiliginizi yansitacak sekilde ozenle hazirlanir.<br>
               <b>Musteri Memnuniyeti:</b> Sizin memnuniyetiniz bizim icin her seyden onemli. Sorulariniza ve isteklerinize hizli ve etkili cozumler sunariz.<br>
               <b>Dogaya Saygi:</b> Uretim sureclerimizde dogaya ve topluma saygili olmayi on planda tutariz.<br> </p>
            </div>
        </div>

