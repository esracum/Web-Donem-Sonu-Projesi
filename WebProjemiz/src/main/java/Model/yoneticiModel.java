package Model;

public class yoneticiModel {
	
	private String kullanici_adi;
	private String sifre;
	
	
	
	
	
	public yoneticiModel(String kullanici_adi) {
	
		this.kullanici_adi = kullanici_adi;
	}

	public yoneticiModel(String kullanici_adi, String sifre) {
		
		this.kullanici_adi = kullanici_adi;
		this.sifre = sifre;
	}

	public String getKullaniciAdi() {
		return kullanici_adi;
	}

	public void setKullaniciAdi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	
	
}
