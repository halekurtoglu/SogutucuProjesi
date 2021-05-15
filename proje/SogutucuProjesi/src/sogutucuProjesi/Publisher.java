package sogutucuProjesi;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject {
	private List<IObserver> aboneler = new ArrayList<>();

    @Override
    public void attach(IObserver abone) {
        aboneler.add(abone);
    }

    @Override
    public void detach(IObserver abone) {
        aboneler.remove(abone);
    }

    @Override
    public void notify(String mesaj) {
        for(IObserver abone: aboneler) {
            abone.update(mesaj);
        }
    }
}
