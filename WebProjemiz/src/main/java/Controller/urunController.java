package Controller;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controller.databaseConnection;
import Model.urunModel;


public class urunController extends databaseConnection{

	public List<urunModel> readingData(int kategori_Id){
	   	 
	 	   try {
	 		   String sorgu="SELECT * FROM urun WHERE kategori_Id=?";
	 		   Class.forName("com.mysql.jdbc.Driver");
	 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
	            ps=con.prepareStatement(sorgu);
	            ps.setInt(1,kategori_Id);
	            ResultSet rs=ps.executeQuery();
	            List<urunModel> liste=new ArrayList<>();
	            while(rs.next())
	            {
	            	urunModel musteri=new urunModel(rs.getInt("urun_Id"),rs.getString("urun_isim"),rs.getString("aciklama"),
	            			rs.getInt("fiyat"),rs.getInt("stok"),rs.getString("fotograf"),rs.getInt("ozel_kategori"),rs.getInt("kategori_Id"));
	            		
	            	liste.add(musteri);
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
	
	
	public List<urunModel> readingData(){
	   	 
	 	   try {
	 		   String sorgu="SELECT * FROM urun";
	 		   Class.forName("com.mysql.jdbc.Driver");
	 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
	            ps=con.prepareStatement(sorgu);
	            
	            ResultSet rs=ps.executeQuery();
	            List<urunModel> liste=new ArrayList<>();
	            while(rs.next())
	            {
	            	urunModel musteri=new urunModel(rs.getInt("urun_Id"),rs.getString("urun_isim"),rs.getString("aciklama"),
	            			rs.getInt("fiyat"),rs.getInt("stok"),rs.getString("fotograf"),rs.getInt("ozel_kategori"),rs.getInt("kategori_Id"));
	            		
	            	liste.add(musteri);
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
		
		
		public void Add(urunModel urun){
		   	  
			
		 	   try {
		 		   String sorgu="INSERT INTO urun(urun_Id,urun_adi,aciklama,fiyat,stok,fotograf,ozel_kategori,kategori_Id) VALUES(?,?,?,?,?,?,?,?)";
		 		   Class.forName("com.mysql.jdbc.Driver");
		 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
		            ps=con.prepareStatement(sorgu);
		            
		            
		            ps.setInt(1, urun.getUrunKodu());
		            ps.setString(2, urun.getUrunAdi());
		            ps.setString(3, urun.getUrunDetay());
		            ps.setInt(4, urun.getUrunFiyat());
		            ps.setInt(5, urun.getUrunAdet());
		            ps.setString(6, urun.getFotograf());
		            ps.setInt(7, urun.getOzelKategori());
		            ps.setInt(8, urun.getKategoriKodu());

		          
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
		

			public void Remove(urunModel urun){
	 	  
				
				try {
					String sorgu="DELETE FROM urun WHERE urun_Id=?";
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
					ps=con.prepareStatement(sorgu);	    
		            ps.setInt(1, urun.getUrunKodu());
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
			


		
			public void Update(urunModel urun){
		  
				
				try {
					String sorgu="UPDATE urun SET urun_adi=?,aciklama=?fiyat=?,stok=?,fotograf=?,ozel_kategori=?,kategori_Id=? WHERE urun_Id=?";
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
					ps=con.prepareStatement(sorgu);	    
			        
		            ps.setString(1, urun.getUrunAdi());
		            ps.setString(2, urun.getUrunDetay());
		            ps.setInt(3, urun.getUrunFiyat());
		            ps.setInt(4, urun.getUrunAdet());
		            ps.setString(5, urun.getFotograf());
		            ps.setInt(6, urun.getOzelKategori());
		            ps.setInt(7, urun.getKategoriKodu());
		            ps.setInt(8, urun.getUrunKodu());
		            
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
			
			
			public List<urunModel> ozelKategori(int kategori_Id){
			   	 
			 	   try {
			 		   String sorgu="SELECT * FROM urun WHERE ozel_kategori=?";
			 		   Class.forName("com.mysql.jdbc.Driver");
			 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
			            ps=con.prepareStatement(sorgu);
			            ps.setInt(1,kategori_Id);
			            ResultSet rs=ps.executeQuery();
			            List<urunModel> liste=new ArrayList<>();
			            while(rs.next())
			            {
			            	urunModel musteri=new urunModel(rs.getInt("urun_Id"),rs.getString("urun_isim"),rs.getString("aciklama"),
			            			rs.getInt("fiyat"),rs.getInt("stok"),rs.getString("fotograf"),rs.getInt("ozel_kategori"),rs.getInt("kategori_Id"));
			            		
			            	liste.add(musteri);
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
			
			public urunModel readingData(urunModel urun){
				urunModel musteri = null;
			 	   try {
			 		   String sorgu="SELECT * FROM urun WHERE urun_Id=?";
			 		   Class.forName("com.mysql.jdbc.Driver");
			 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
			            ps=con.prepareStatement(sorgu);
			            ps.setInt(1,urun.getUrunKodu());
			            ResultSet rs=ps.executeQuery();
			            
			           
			            musteri=new urunModel(rs.getInt("urun_Id"),rs.getString("urun_isim"),rs.getString("aciklama"),
			            			rs.getInt("fiyat"),rs.getInt("stok"),rs.getString("fotograf"),rs.getInt("ozel_kategori"),rs.getInt("kategori_Id"));
			            		
			            	
			            
			            return musteri;
			         
			        } 
			        catch (ClassNotFoundException | SQLException exception) {
			            System.out.println("Bir hata meydana geldi:"+exception);
			            return musteri;
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
			
			
		public boolean control(urunModel urun) {
						
						
						boolean result=false;
					
						try {
							
							String sorgu="SELECT * FROM urun";
				 		   	Class.forName("com.mysql.jdbc.Driver");
				 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
				            ps=con.prepareStatement(sorgu);		            
				            ResultSet rs=ps.executeQuery();
				            while(rs.next()) 
				             {
				            	
				 
				            	if(urun.getUrunKodu()==(rs.getInt("urun_Id")))
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
				
			
			
	
}
