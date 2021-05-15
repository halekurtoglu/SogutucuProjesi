/**
*
* @author Halenur Kurtoðlu / halenur.kurtoglu@ogr.sakarya.edu.tr / g191210067
* @since 15.05.2021
* 
**/
package sogutucuProjesi;

public class Main {

	public static void main(String[] args) {
		AgArayuzu arayuz = new AgArayuzu();
	    Eyleyici eyleyici= new Eyleyici();
	    SicaklikAlgilayici algilayici=new SicaklikAlgilayici();
	     
		Publisher p = new Publisher();
		p.attach(arayuz);
        p.attach(eyleyici);
        p.attach(algilayici);

		AnaIslemPlatformu program=new AnaIslemPlatformu(p);
		program.bildir("Cihaz acik");
		arayuz.sistemeBaglan();
		program.islemGerceklestir();
	}

}
