package Model;


public class urunModel {

	private int urun_Id;
	private String urun_isim;
	private String aciklama;
	private int fiyat;
	private int stok;
	private String fotograf;
	private int ozel_kategori;
	private int kategori_Id;
	
	
	public urunModel(int urun_Id) {
	
		this.urun_Id = urun_Id;
	}

	
	public urunModel(int urun_Id, String fotograf, String urun_isim, int fiyat) {
	
		this.urun_Id= urun_Id;
		this.fotograf = fotograf;
		this.urun_isim = urun_isim;
		this.fiyat = fiyat;
	}


	public urunModel(String urun_isim, String aciklama, int fiyat, int stok, String fotograf, int ozel_kategori,
			int kategori_Id) {
		super();
		this.urun_isim = urun_isim;
		this.aciklama = aciklama;
		this.fiyat = fiyat;
		this.stok = stok;
		this.fotograf = fotograf;
		this.ozel_kategori = ozel_kategori;
		this.kategori_Id = kategori_Id;
	}


	public urunModel(int urun_Id, String urun_isim, String aciklama, int fiyat, int stok, String fotograf,
			int ozel_kategori, int kategori_Id) {
		
		this.urun_Id = urun_Id;
		this.urun_isim = urun_isim;
		this.aciklama = aciklama;
		this.fiyat = fiyat;
		this.stok = stok;
		this.fotograf = fotograf;
		this.ozel_kategori = ozel_kategori;
		this.kategori_Id = kategori_Id;
	}

	public String getFotograf() {
		return fotograf;
	}

	public void setFotograf(String fotograf) {
		this.fotograf = fotograf;
	}

	
	public int getOzelKategori() {
		return ozel_kategori;
	}
	public void setOzelKategori(int ozel_kategori) {
		this.ozel_kategori = ozel_kategori;
	}
	public int getKategoriKodu() {
		return kategori_Id;
	}
	public void setKategoriKodu(int kategori_Id) {
		this.kategori_Id = kategori_Id;
	}
	public int getUrunKodu() {
		return urun_Id;
	}
	public void setUrunKodu(int urun_Id) {
		this.urun_Id = urun_Id;
	}
	public String getUrunAdi() {
		return urun_isim;
	}
	public void setUrunAdi(String urun_isim) {
		this.urun_isim = urun_isim;
	}
	public String getUrunDetay() {
		return aciklama;
	}
	public void setUrunDetay(String aciklama) {
		this.aciklama = aciklama;
	}
	public int getUrunFiyat() {
		return fiyat;
	}
	public void setUrunFiyat(int fiyat) {
		this.fiyat =fiyat;
	}
	public int getUrunAdet() {
		return stok;
	}
	public void setUrunAdet(int stok) {
		this.stok = stok;
	}

   
   
}
