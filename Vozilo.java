package nedeljaX;

public abstract class Vozilo {
	
        //* Element i 
	private String id; 
	protected double maxBrzina;
	
	   //* Constructor 
	public Vozilo(String id, double maxBrzina) {
		super();
		this.id = id;
		this.maxBrzina = maxBrzina;
	}
	//* Getter i setter 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getMaxBrzina() {
		return maxBrzina;
	}
	public void setMaxBrzina(int maxBrzina) {
		this.maxBrzina = maxBrzina;
	} 
	public void info() {
	    System.out.println("ID vozila: " + id);
	    System.out.println("Maksimalna brzina: " + maxBrzina + " km/h");
	}
	
	public abstract double izracunajVrijemeDostave (double udaljenostKm); 
		
	}

