package Controller;

import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controller.databaseConnection;
import Model.siparisModel;

public class siparisController extends databaseConnection{

	public List<siparisModel> readingData(){
	   	 
	 	   try {
	 		   String sorgu="SELECT * FROM siparis";
	 		   Class.forName("com.mysql.jdbc.Driver");
	 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
	            ps=con.prepareStatement(sorgu);
	            ResultSet rs=ps.executeQuery();
	            List<siparisModel> liste=new ArrayList<>();
	            while(rs.next())
	            {
	            	siparisModel siparis=new siparisModel(rs.getInt("siparis_Id"),rs.getString("siparis_tarihi"),rs.getString("isleme"),
	            							rs.getString("hazirlama"),rs.getString("kargolanma"),rs.getString("teslim"),rs.getString("odeme_tipi"),rs.getString("musteri_kullanici_adi"));
	            		
	            	liste.add(siparis);
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
		
		
		public void Add(siparisModel siparis){
		   	  
			
		 	   try {
		 		   String sorgu="INSERT INTO siparis(siparis_tarihi,isleme,hazirlama,kargolanma,teslim,odeme_tipi,musteri_kullanici_adi) VALUES(?,?,?,?,?,?,?)";
		 		   Class.forName("com.mysql.jdbc.Driver");
		 		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
		            ps=con.prepareStatement(sorgu);
		            
		            
		            
		            ps.setString(1, siparis.getSiparisTarihi());
		            ps.setString(2, siparis.getIsleme());
		            ps.setString(3, siparis.getHazirlanma());
		            ps.setString(4, siparis.getKargolanma());
		            ps.setString(5, siparis.getTeslim());
		            ps.setString(6, siparis.getOdemeTipi());
		            ps.setString(7, siparis.getUyekullaniciAdi());

		          
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
		

			public void Remove(siparisModel siparis){
	 	  
				int i=0;
				try {
					String sorgu="DELETE FROM siparis WHERE siparis_Id=?";
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
					ps=con.prepareStatement(sorgu);	    
		            ps.setInt(1, siparis.getSiparisKodu());
		            i=ps.executeUpdate();
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
		            if(i>0) 
		            {
		                 System.out.println("kayit silindi");
		            }
		            else 
		            {
		            	System.out.println("kayit silinmedi");
		            }
				}
			


		
			public void Update(siparisModel siparis){
		  
				int i=0;
				try {
					String sorgu="UPDATE siparis SET siparis_tarihi=?,isleme=?,hazirlama=?,kargolanma=?,teslim=?,odeme_tipi=? WHERE siparis_Id=?";
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eticaret","root","");
					ps=con.prepareStatement(sorgu);	    
			        
		            ps.setString(1, siparis.getSiparisTarihi());
		            ps.setString(2, siparis.getIsleme());
		            ps.setString(3, siparis.getHazirlanma());
		            ps.setString(4, siparis.getKargolanma());
		            ps.setString(5, siparis.getTeslim());
		            ps.setString(6, siparis.getOdemeTipi());
		            ps.setInt(7, siparis.getSiparisKodu());
		            
			        i=ps.executeUpdate();
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
			        if(i>0) 
			        {
			             System.out.println("guncelleme yapildi");
			        }
			        else 
			        {
			        	System.out.println("guncelleme yapilmadi");
			        }
				}
}

