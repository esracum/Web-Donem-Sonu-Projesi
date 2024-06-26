<%@page import ="Controller.musteriController,Model.musteriModel"%>

<%

String kullaniciAdi=request.getParameter("kullaniciAdi");
String sifre=request.getParameter("sifre");
String ad=request.getParameter("ad");
String soyad=request.getParameter("soyad");
String telefon=request.getParameter("telefon");
String mail=request.getParameter("mail");
String sehir=request.getParameter("sehir");
String ilce=request.getParameter("ilce");
String adres=request.getParameter("adres");

musteriModel musteri=new musteriModel(kullaniciAdi,ad,soyad,telefon,mail,sifre,sehir,ilce,adres);
musteriController db=new musteriController();
boolean result=db.control(musteri);
	
if(result){
	
	db.Update(musteri);
}
else{
	
	db.Add(musteri);
}
response.sendRedirect("adminpanel.jsp#list-item-1");
%>