package Model;

public class musteriModel {

	private String kullanici_adi;
	private String ad;
	private String soyad;
	private String telefon;
	private String email;
	private String sifre;
	private String sehir;
	private String ilce;
	private String adres;
	
	
	
	public musteriModel(String kullanici_adi, String ad, String soyad, String email, String sifre) {
		
		this.kullanici_adi = kullanici_adi;
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
		this.sifre = sifre;
	}


	public musteriModel(String kullanici_adi) {
		
		this.kullanici_adi = kullanici_adi;
	}
	
	
	public musteriModel(String kullanici_adi, String sifre) {
		
		this.kullanici_adi = kullanici_adi;
		this.sifre = sifre;
	}


	public musteriModel(String kullanici_adi, String ad, String soyad, String telefon, String email, String sehir,
			String ilce, String adres) {
		
		this.kullanici_adi = kullanici_adi;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.email = email;
		this.sehir = sehir;
		this.ilce = ilce;
		this.adres = adres;
	}


	public musteriModel(String kullanici_adi, String ad, String soyad, String telefon, String email, String sifre, String sehir,
			String ilce, String adres) {
		
		this.kullanici_adi = kullanici_adi;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.email = email;
		this.sifre = sifre;
		this.sehir = sehir;
		this.ilce = ilce;
		this.adres = adres;
	}
	public String getKullaniciAdi() {
		return kullanici_adi;
	}
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public void setKullaniciAdi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public String geteMail() {
		return email;
	}
	public void seteMail(String email) {
		this.email = email;
	}
	
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
}
