import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
    	
    	Vozilo bicikl = new Bicikl("A1","14");
    	Vozilo motor = new Motor("A2", "18");
		Vozilo auto = new Auto("A3", "120" );
    }
    double udaljenost = 10.0;
    
    System.out.println("Bicikl");
    bicikl.info();
    System.out.println("Vrijeme dostave: " + bicikl.izracunajVrijemeDostave(udaljenost));
    System.out.println("Potrosnja: " + ((Ekonomican) bicikl).potrosnjaPoKm() + "\n");}


System.out.println("Motor");
motor.info();
System.out.println("Vrijeme dostave: " + motor.izracunajVrijemeDostave(udaljenost));
System.out.println("Potrosnja: " + ((Ekonomican) motor).potrosnjaPoKm() + "\n");


}
System.out.println("Auto");
auto.info();
System.out.println("Vrijeme dostave: " + auto.izracunajVrijemeDostave(udaljenost));
}
}