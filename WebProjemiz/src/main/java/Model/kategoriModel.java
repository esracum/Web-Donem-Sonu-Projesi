package Model;

public class kategoriModel {

	private int kategori_Id;
    private String kategori_adi;
    
	public kategoriModel(int kategori_Id, String kategori_adi) {
		
		this.kategori_Id = kategori_Id;
		this.kategori_adi = kategori_adi;
	}

	public kategoriModel(int kategori_Id) {
		
		this.kategori_Id = kategori_Id;
	}

	public int getKategoriId() {
		return kategori_Id;
	}

	public void setKategoriId(int kategori_Id) {
		this.kategori_Id = kategori_Id;
	}

	public String getKategoriAdi() {
		return kategori_adi;
	}

	public void setKategoriAdi(String kategori_adi) {
		this.kategori_adi = kategori_adi;
	}
    
	
	
}
