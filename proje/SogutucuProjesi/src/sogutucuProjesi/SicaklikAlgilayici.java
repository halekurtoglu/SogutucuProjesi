package sogutucuProjesi;

import java.util.Random;

public class SicaklikAlgilayici implements IObserver {
	private int sicaklik;
	@Override
	public void update(String mesaj) {
		System.out.println("Sicaklik algilayiciya giden mesaj -->"+mesaj);
	}
	public void sicaklikOlc() {
		Random rand= new Random();
		this.sicaklik=rand.nextInt(60)-20;
	}
	public void sicaklikGoruntule() {
		sicaklikOlc();
		System.out.println("\nOrtam sicakligi: "+sicaklik+ " derece");
        
    }
}
