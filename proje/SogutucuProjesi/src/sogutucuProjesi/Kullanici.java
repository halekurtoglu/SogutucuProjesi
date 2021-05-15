package sogutucuProjesi;

public class Kullanici {
	private String kullaniciAdi;
	private String sifre;
	private String email;
	private String telefon;
	private String adres;
	private Kullanici(KullaniciBuilder builder) {
		this.kullaniciAdi=builder.kullaniciAdi;
		this.sifre=builder.sifre;
		this.email=builder.email;
		this.telefon=builder.telefon;
		this.adres=builder.adres;
	}
	public String getKullaniciAdi() {
        return kullaniciAdi;
    }
	public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
	public String getSifre() {
        return sifre;
    }
	public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAdres() {
        return adres;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public static class KullaniciBuilder{
		private String kullaniciAdi;
		private String sifre;
		private String email;
		private String telefon;
		private String adres;
		public KullaniciBuilder(String kullaniciAdi, String sifre) {
			this.kullaniciAdi = kullaniciAdi;
            this.sifre = sifre;
		}
        public KullaniciBuilder email (String email) {
            this.email = email;
            return this;
        }
        public KullaniciBuilder telefon (String telefon) {
            this.telefon = telefon;
            return this;
        }
        public KullaniciBuilder adres (String adres) {
            this.adres = adres;
            return this;
        }
        public Kullanici build() {
        	return new Kullanici(this);
        }
    }
}
