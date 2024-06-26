package Model;
import Controller.siparisController;
public class siparisModel {

	 private int siparis_Id;
	 private String siparis_tarihi ; 
	 private String isleme; 
	 private String hazirlama;
	 private String kargolanma ; 
	 private String teslim ;
	 private String odeme_tipi;
	 private String musteri_kullanici_adi;
	 
	 
	 
	 



	


	public String getUyekullaniciAdi() {
		return musteri_kullanici_adi;
	}





	public void setUyekullaniciAdi(String musteri_kullanici_adi ) {
		this.musteri_kullanici_adi = musteri_kullanici_adi;
	}





	public siparisModel(int siparis_Id, String siparis_tarihi, String isleme, String hazirlama, String kargolanma,
			String teslim, String odeme_tipi, String musteri_kullanici_adi) {
		
		this.siparis_Id = siparis_Id;
		this.siparis_tarihi = siparis_tarihi;
		this.isleme = isleme;
		this.hazirlama = hazirlama;
		this.kargolanma = kargolanma;
		this.teslim = teslim;
		this.odeme_tipi = odeme_tipi;
		this.musteri_kullanici_adi = musteri_kullanici_adi;
	}


	


	public siparisModel(String siparis_tarihi, String isleme, String hazirlama, String kargolanma, String teslim,
			String odeme_tipi, String musteri_kullanici_adi) {
		super();
		this.siparis_tarihi = siparis_tarihi;
		this.isleme = isleme;
		this.hazirlama = hazirlama;
		this.kargolanma = kargolanma;
		this.teslim = teslim;
		this.odeme_tipi = odeme_tipi;
		this.musteri_kullanici_adi = musteri_kullanici_adi;
	}





	public siparisModel(int siparis_Id, String siparis_tarihi, String isleme, String hazirlama, String kargolanma,
			String teslim, String odeme_tipi) {
		super();
		this.siparis_Id = siparis_Id;
		this.siparis_tarihi =siparis_tarihi;
		this.isleme = isleme;
		this.hazirlama = hazirlama;
		this.kargolanma = kargolanma;
		this.teslim = teslim;
		this.odeme_tipi = odeme_tipi;
	}


	public int getSiparisKodu() {
		return siparis_Id;
	}


	public void setSiparisKodu(int siparis_Id) {
		this.siparis_Id= siparis_Id;
	}


	public String getSiparisTarihi() {
		return siparis_tarihi;
	}


	public void setSiparisTarihi(String siparis_tarihi) {
		this.siparis_tarihi =siparis_tarihi;
	}


	public String getIsleme() {
		return isleme;
	}


	public void setIsleme(String isleme) {
		this.isleme = isleme;
	}


	public String getHazirlanma() {
		return hazirlama;
	}


	public void setHazirlanma(String hazirlama) {
		this.hazirlama = hazirlama;
	}


	public String getKargolanma() {
		return kargolanma;
	}


	public void setKargolanma(String kargolanma) {
		this.kargolanma = kargolanma;
	}


	public String getTeslim() {
		return teslim;
	}


	public void setTeslim(String teslim) {
		this.teslim = teslim;
	}


	public String getOdemeTipi() {
		return odeme_tipi;
	}


	public void setOdemeTipi(String odeme_tipi) {
		this.odeme_tipi = odeme_tipi;
	}



	 
	 
	
	
     
     
}