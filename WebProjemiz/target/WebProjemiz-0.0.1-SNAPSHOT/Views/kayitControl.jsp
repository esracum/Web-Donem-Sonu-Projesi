<%@ page import="Controller.musteriController,Model.musteriModel,java.util.*"%>


<%

	boolean result=false;

	String kullaniciAdi = request.getParameter("kullaniciAdi");
	String sifre = request.getParameter("sifre");
	String ad = request.getParameter("ad");
	String soyad = request.getParameter("soyad");
	String eMail = request.getParameter("eMail");

	musteriController uDao=new musteriController();
	List<musteriModel> uyeler=uDao.readingData();

	for(musteriModel uye:uyeler) {
			
		if(uye.getKullaniciAdi().equals(kullaniciAdi)) {
		
			result=true;
			break;
		}
	}

	if(result) {
	
		session.setAttribute("kayit","true");
		response.sendRedirect("uyeKayit.jsp");
	}
	else {
		
		session.setAttribute("kayit","false");
		musteriModel uModel=new musteriModel(kullaniciAdi,ad,soyad," ",eMail,sifre," "," "," ");
		uDao.Add(uModel);
		response.sendRedirect("uyeKayit.jsp");
	}

%>