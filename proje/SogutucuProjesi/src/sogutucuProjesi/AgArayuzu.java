package sogutucuProjesi;

import java.util.Scanner;



public class AgArayuzu implements IObserver{
	String ad;
	String sifre;
	postgreSql veritabani=new postgreSql();
	Scanner girdi = new Scanner(System.in);
	@Override
	public void update(String mesaj) {
		System.out.println("Ag arayuzune giden mesaj ----------->"+mesaj);
	}
	void verileriAl() {
		System.out.println("\nLogin");
		System.out.println("Kullanici Adi:");
		ad= girdi.next();
		System.out.println("Þifre:");
		sifre= girdi.next();
	}
	void yetkiliKullanici() {
		Kullanici kullanici = new Kullanici.KullaniciBuilder(ad, sifre).build();
		System.out.println("\nHosgeldin,"+kullanici.getKullaniciAdi()+"\n");
	}
	void sistemeBaglan() {
		while(true) {
			verileriAl();
			boolean kontrol=veritabani.dogrula(ad,sifre);
			if(kontrol==true) {
				yetkiliKullanici();
				break;
			}
			else {
				System.out.println("Hatalý kullanýcý adý ya da parola...");
			}
		}
	}
	
	

}
