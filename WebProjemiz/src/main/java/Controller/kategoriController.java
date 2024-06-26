package Controller;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controller.databaseConnection;
import Model.kategoriModel;

public class kategoriController extends databaseConnection{

	public List<kategoriModel> readingData(){
	   	 
	 	   try {
	 		   String sorgu="SELECT * FROM kategori";
	 		   Class.forName("com.mysql.jdbc.Driver");
	 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
	            ps=con.prepareStatement(sorgu);
	            ResultSet rs=ps.executeQuery();
	            List<kategoriModel> liste=new ArrayList<>();
	            while(rs.next())
	            {
	            	kategoriModel kategori=new kategoriModel(rs.getInt("kategori_Id"),rs.getString("kategori_adi"));
	            		
	            	liste.add(kategori);
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
		
		
		public void Add(kategoriModel kategori){
		   	  
		
		 	   try {
		 		   String sorgu="INSERT INTO kategori(kategori_Id,kategori_adi) VALUES(?,?)";
		 		   Class.forName("com.mysql.jdbc.Driver");
		 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
		            ps=con.prepareStatement(sorgu);
		           
		            
		            ps.setInt(1, kategori.getKategoriId());
		            ps.setString(2, kategori.getKategoriAdi());
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
		

			public void Remove(kategoriModel kategori){
	 	  
			
				try {
					String sorgu="DELETE FROM kategori WHERE kategori_Id=?";
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
						ps=con.prepareStatement(sorgu);	 
						
		            ps.setInt(1, kategori.getKategoriId());
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
			


		
			public void Update(kategoriModel kategori){
		  
				
				try {
					String sorgu="UPDATE kategori SET kategori_adi=? WHERE kategori_Id=?";
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
					ps=con.prepareStatement(sorgu);	    
			        
		            ps.setString(1, kategori.getKategoriAdi());
		            ps.setInt(2, kategori.getKategoriId());
		            
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
			
				public boolean control(kategoriModel kt) {
								
								
								boolean result=false;
								
								try {
									
									String sorgu="SELECT kategori_Id FROM kategori";
						 		   	Class.forName("com.mysql.jdbc.Driver");
						 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
						            ps=con.prepareStatement(sorgu);		            
						            ResultSet rs=ps.executeQuery();
						            while(rs.next()) 
						             {
						            
						            	
						 
						            	if(rs.getInt("kategori_Id")==kt.getKategoriId())
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
