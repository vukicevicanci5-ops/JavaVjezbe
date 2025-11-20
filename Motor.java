package nedeljaX;

public class Motor extends Vozilo implements Ekonomican {

	public Motor(String id, double maxBrzina) {
		super(id, maxBrzina);
		
	}

	@Override
	public double potrosnjaPoKm() {
		return 0;
	}

	@Override
	public double izracunajVrijemeDostave(double udaljenostKm) {
		return udaljenostKm / maxBrzina;
	}

}
