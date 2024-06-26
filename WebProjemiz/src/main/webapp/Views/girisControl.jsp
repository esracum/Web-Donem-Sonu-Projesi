<%@page import ="Model.musteriModel,Controller.musteriController"  %>

<%

	String kullaniciAdi=request.getParameter("kullaniciAdi");
	String sifre=request.getParameter("sifre");

	musteriModel uModel=new musteriModel(kullaniciAdi,sifre);
	musteriController uye=new musteriController();
	boolean result=uye.control(uModel);
	if(result) {
	 
		 session.setAttribute("session","true");
		 Cookie cookie = new Cookie("username",kullaniciAdi);
		 cookie.setMaxAge(60 * 60 * 24);
         response.addCookie(cookie);
		 response.sendRedirect("Home.jsp");
	 		
	}
	else {
	 	
		
		Cookie cookie = new Cookie("username","false");
		cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);
		session.setAttribute("session","false");
		response.sendRedirect("uyeGiris.jsp");
	 
	}

%>