package sogutucuProjesi;

import java.util.Scanner;

public class AnaIslemPlatformu {
	String secim;
	ISubject publisher;
	private String cihazDurumu;
	
	public AnaIslemPlatformu(ISubject publisher) {
		this.publisher = publisher;
	}
	public void bildir(String cihazDurumu) {
		this.cihazDurumu=cihazDurumu;
		publisher.notify(" Cihaz durumu: "+cihazDurumu);
	}
	public String getCihazDurumu() {
        return cihazDurumu;
    }
	void islemGerceklestir() {
		Scanner deger = new Scanner(System.in);
		SicaklikAlgilayici sicaklik=new SicaklikAlgilayici();
		Eyleyici eyleyici=new Eyleyici();
		while(true) {
			
			System.out.println("\nLütfen bir iþlem seçiniz");
			System.out.println("1-Sicaklik Goruntule");
			System.out.println("2-Sogutucuyu Ac");
			System.out.println("3-Sogutucuyu Kapat");
			System.out.println("4-Cikis\n");
			bildir("Cihaz bekliyor...");
			System.out.println("\nIslem:");
			secim= deger.next();
			switch (secim) {
	        case "1":  
	           bildir("Cihaz sicakligi algiliyor.");
	           sicaklik.sicaklikGoruntule();
	           break;
	        case "2": 
	           bildir("Cihaz sogutucuyu aciyor.");
	           eyleyici.sogutucuyuAc();
	           break;
	        case "3": 
	           bildir("Cihaz sogutucuyu kapiyor.");
	           eyleyici.sogutucuyuKapat();
	           break;
	        case "4": 
	        	bildir("Cihaz kapatiliyor.");
	        	System.out.println("Cihazi Kapali.");
	        	deger.close();
	        	System.exit(0);
	           break;
	        default: 
	           System.out.println("Secim 1-4 arasinda olmalidir.");
	           break;
			}
		}
		
	}
	
}
