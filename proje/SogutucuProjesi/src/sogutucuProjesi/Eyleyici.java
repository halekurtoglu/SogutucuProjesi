package sogutucuProjesi;

public class Eyleyici implements IObserver {
	boolean sogutucuDurumu=false;
	@Override
	public void update(String mesaj) {
		System.out.println("Eyleyiciye giden mesaj ------------->"+mesaj);
	}
	public void sogutucuyuAc(){
		if(sogutucuDurumu==false) {
			sogutucuDurumu=true;
			System.out.println("\nSo�utucu acildi.");
		}
		else {
			System.out.println("\nSogutucu zaten acik durumda.");
		}
		
	}
	public void sogutucuyuKapat(){
		if(sogutucuDurumu==true) {
			sogutucuDurumu=false;
			System.out.println("\nSo�utucu kapandi.");
		}
		else {
			System.out.println("\nSogutucu zaten kapali durumda.");
		}
		
	}
}
