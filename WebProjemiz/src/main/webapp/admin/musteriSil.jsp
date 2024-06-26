<%@page import ="Controller.musteriController,Model.musteriModel"%>

<%
			String idem=request.getQueryString();
            musteriModel uyef=new musteriModel(idem);
			musteriController dbff=new musteriController();
			dbff.Remove(uyef);
			response.sendRedirect("adminpanel.jsp#list-item-1");
%>