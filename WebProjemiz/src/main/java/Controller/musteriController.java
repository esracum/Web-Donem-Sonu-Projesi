package Controller;

import java.util.*;

import Controller.databaseConnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import Model.musteriModel;

public class musteriController extends databaseConnection{

	public List<musteriModel> readingData(){
   	 
 	   try {
 		   String sorgu="SELECT * FROM musteri";
 		   Class.forName("com.mysql.jdbc.Driver");
 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
            ps=con.prepareStatement(sorgu);
            ResultSet rs=ps.executeQuery();
            List<musteriModel> liste=new ArrayList<>();
            while(rs.next())
            {
            	musteriModel uye=new musteriModel(rs.getString("kullanici_adi"),rs.getString("ad"),rs.getString("soyad"),
            							rs.getString("telefon"),rs.getString("email"),rs.getString("sifre"),
            							rs.getString("sehir"),rs.getString("ilce"),rs.getString("adres"));
            		
            	liste.add(uye);
            }
            
            return liste;
         
        } 
        catch (ClassNotFoundException | SQLException exception) {
            System.out.println("Bir hata meydana geldi:"+exception);
            return null;
        }
 	   finally{ 
            try {
                if(con!=null){ 
                    con.close();
                }
                if(ps!=null){ 
                    ps.close();
                }
            } catch (SQLException sqlException) {
                System.out.println("Bir hata meydana geldi:"+sqlException);
            }
        }
 	   
     }
	
	
	public void Add(musteriModel musteriModel){
	   	  
		
	 	   try {
	 		   String sorgu="INSERT INTO musteri(kullanici_adi,ad,soyad,telefon,email,sifre,sehir,ilce,adres) VALUES(?,?,?,?,?,?,?,?,?)";
	 		   Class.forName("com.mysql.jdbc.Driver");
	 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
	            ps=con.prepareStatement(sorgu);
	            
	            
	            ps.setString(1, musteriModel.getKullaniciAdi());
	            ps.setString(2, musteriModel.getAd());
	            ps.setString(3, musteriModel.getSoyad());
	            ps.setString(4, musteriModel.getTelefon());
	            ps.setString(5, musteriModel.geteMail());
	            ps.setString(6, musteriModel.getSifre());
	            ps.setString(7, musteriModel.getSehir());
	            ps.setString(8, musteriModel.getIlce());
	            ps.setString(9, musteriModel.getAdres());
	          
	           ps.executeUpdate();
	 	   }
	           
	            catch(ClassNotFoundException | SQLException exception)
	            {
	                System.out.println(exception);
	                setErrorMessage(exception.toString());
	            }
	            finally 
	            {
	                try {
	                    if(con!=null){
	                        con.close();
	                    }
	                    if(ps!=null){
	                        ps.close();
	                    }
	                }
	                catch(SQLException sqlException)
	                {
	                    System.out.println(sqlException);
	                }
	            }
	            
	        }


			private void setErrorMessage(String string) {
					// TODO Auto-generated method stub
		
			}
	

		public void Remove(musteriModel uyemodel){
 	  
			
			try {
				String sorgu="DELETE FROM musteri WHERE kullanici_adi=?";
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
				ps=con.prepareStatement(sorgu);	    
	            ps.setString(1,uyemodel.getKullaniciAdi());
	            ps.executeUpdate();
	 	   }
	           
	            catch(ClassNotFoundException | SQLException exception)
	            {
	                System.out.println(exception);
	                setErrorMessage(exception.toString());
	            }
	            finally 
	            {
	                try {
	                    if(con!=null){
	                        con.close();
	                    }
	                    if(ps!=null){
	                        ps.close();
	                    }
	                }
	                catch(SQLException sqlException)
	                {
	                    System.out.println(sqlException);
	                }
	            }
	            
			}
		


	
		public void Update(musteriModel musteriModel){
	  
			
			try {
				String sorgu="UPDATE musteri SET ad=?,soyad=?,telefon=?,email=?,sifre=?,sehir=?,ilce=?,adres=? WHERE kullanici_adi=?";
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
				ps=con.prepareStatement(sorgu);	    
		        
				
	            ps.setString(1, musteriModel.getAd());
	            ps.setString(2, musteriModel.getSoyad());
	            ps.setString(3, musteriModel.getTelefon());
	            ps.setString(4, musteriModel.geteMail());
	            ps.setString(5, musteriModel.getSifre());
	            ps.setString(6, musteriModel.getSehir());
	            ps.setString(7, musteriModel.getIlce());
	            ps.setString(8, musteriModel.getAdres());
	            ps.setString(9, musteriModel.getKullaniciAdi());
	            
		        ps.executeUpdate();
			   }
		       
		        catch(ClassNotFoundException | SQLException exception)
		        {
		            System.out.println(exception);
		            setErrorMessage(exception.toString());
		        }
		        finally 
		        {
		            try {
		                if(con!=null){
		                    con.close();
		                }
		                if(ps!=null){
		                    ps.close();
		                }
		            }
		            catch(SQLException sqlException)
		            {
		                System.out.println(sqlException);
		            }
		        }
		        
			}
		
		
		public void uyeUpdate(musteriModel musteriModel){
			  
			
			try {
				String sorgu="UPDATE musteri SET ad=?,soyad=?,telefon=?,email=?,sehir=?,ilce=?,adres=? WHERE kullanici_adi=?";
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
				ps=con.prepareStatement(sorgu);	    
		        
				
	            ps.setString(1, musteriModel.getAd());
	            ps.setString(2, musteriModel.getSoyad());
	            ps.setString(3, musteriModel.getTelefon());
	            ps.setString(4, musteriModel.geteMail());
	            ps.setString(5, musteriModel.getSehir());
	            ps.setString(6, musteriModel.getIlce());
	            ps.setString(7, musteriModel.getAdres());
	            ps.setString(8, musteriModel.getKullaniciAdi());
	            
		        ps.executeUpdate();
			   }
		       
		        catch(ClassNotFoundException | SQLException exception)
		        {
		            System.out.println(exception);
		            setErrorMessage(exception.toString());
		        }
		        finally 
		        {
		            try {
		                if(con!=null){
		                    con.close();
		                }
		                if(ps!=null){
		                    ps.close();
		                }
		            }
		            catch(SQLException sqlException)
		            {
		                System.out.println(sqlException);
		            }
		        }
		        
			}
		
		public boolean control(musteriModel musteri) {
				
				String userName = musteri.getKullaniciAdi();
				String password = musteri.getSifre();
				boolean result=false;
				String userNameDB = "";
		        String passwordDB = "";
				try {
					
					String sorgu="SELECT kullanici_adi,sifre FROM musteri";
		 		   	Class.forName("com.mysql.jdbc.Driver");
		 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
		            ps=con.prepareStatement(sorgu);	
		            
		            ResultSet rs=ps.executeQuery();
		            while(rs.next()) 
		             {
		            	userNameDB = rs.getString("kullanici_adi"); 
		            	passwordDB = rs.getString("sifre");
		 
		            	if(userName.equals(userNameDB) && password.equals(passwordDB))
		            	{
		                  result=true; 
		            	}
		             }
		            return result;
				}
				catch(ClassNotFoundException | SQLException exception)
			        {
			            System.out.println(exception);
			            setErrorMessage(exception.toString());
			           return result;
			        }
				finally 
		        {
		            try {
		                if(con!=null){
		                    con.close();
		                }
		                if(ps!=null){
		                    ps.close();
		                }
		            }
		            catch(SQLException sqlException)
		            {
		                System.out.println(sqlException);
		            }
		        }

		}
		
		public musteriModel readingData(String user){
		   	 
		 	   try {
		 		   String sorgu="SELECT * FROM uye WHERE kullanici_adi=?";
		 		   Class.forName("com.mysql.jdbc.Driver");
		 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
		            ps=con.prepareStatement(sorgu);
		            ps.setString(1,user);
		            ResultSet rs=ps.executeQuery();
		            musteriModel musteri;
		           
		            
		            	 musteri=new musteriModel(rs.getString("kullanici_adi"),rs.getString("ad"),rs.getString("soyad"),
		            							rs.getString("telefon"),rs.getString("email"),rs.getString("sifre"),
		            							rs.getString("sehir"),rs.getString("ilce"),rs.getString("adres"));
		            		
		            	
		            
		            
		            return musteri;
		         
		        } 
		        catch (ClassNotFoundException | SQLException exception) {
		            System.out.println("Bir hata meydana geldi:"+exception);
		            return null;
		        }
		 	   finally{ 
		            try {
		                if(con!=null){ 
		                    con.close();
		                }
		                if(ps!=null){ 
		                    ps.close();
		                }
		            } catch (SQLException sqlException) {
		                System.out.println("Bir hata meydana geldi:"+sqlException);
		            }
		        }
		 	   
		     }
		
}
