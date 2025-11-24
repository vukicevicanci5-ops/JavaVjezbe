/*2.  Kreirati sistem za upravljanje vozilima koji podržava rad sa različitim
tipovima vozila. Osnovna klasa Vozilo treba da sadrži atribute: proizvođač,
godinaProizvodnje, kubikaža i boja. Iz ove klase nasljeđuju se tri specifične klase:
a. Automobil - dodatni atributi: brojVrata, tipMotora
b. Kamion – dodatni atributi: kapacitetTereta, prikolica (da/ne)
c. Kombi – dodatni atribut: kapacitetPutnika
Za svaku klasu implementirati konstruktor, getere, setere i metodu za prikaz
informacija o vozilu. Potrebno je kreirati i metodu koja računa cijenu registracije
vozila. Osnovna cijena je 100 eura, a uvećava se po sledećim pravilima:
● Ako je vozilo starije od 2010 cijenu uvećati za 30 EUR
● Ako je kubikaža veća od 2000 cijenu uvećati za 50 EUR
● Ako je automobil dizel cijenu uvećati za 20 EUR
● Ako kamion ima prikolicu cijenu uvećati za 50 EUR
● Ako kombi ima više od 8 putnika cijenu uvećati za 30 EUR
Za svako vozilo odštampati osnovne podatke i ukupnu cijenu registracije. Na kraju,
pomoću Draw.io prikazati dijagram klasa sa svim atributima, metodama i
nasljeđivanjem.*/ 

class Vozilo {
     private String proizvodjac;
     private int godinaProizvodnje;
     private int kubikaza;
     private String boja;
     public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja) {
          this.proizvodjac = proizvodjac;
          this.godinaProizvodnje = godinaProizvodnje;
          this.kubikaza = kubikaza;
          this.boja = boja;
}
// Getteri / setteri
     
public String getProizvodjac() { return proizvodjac; }                //* public tipPodatka getVarijabla () { return varijabla;} 
public void setProizvodjac(String proizvodjac) { this.proizvodjac = proizvodjac; } //* public void setVarijabla (tipVarijable Varijabla) { this.varijabla = varijabla;}
public int getGodinaProizvodnje() { return godinaProizvodnje; }       //* public int getGodinaProizvodnje() { return godinaProizvodnje;} 
public void setGodinaProizvodnje(int godinaProizvodnje) { this.godinaProizvodnje = godinaProizvodnje; }  //* public void setGodinaProizvodnje (int godinaProizvodnje) {thic.godinaProizvodnje = godinaProizvodnje; } 
public int getKubikaza() { return kubikaza; }
public void setKubikaza(int kubikaza) { this.kubikaza = kubikaza; }
public String getBoja() { return boja; }
public void setBoja(String boja) { this.boja = boja; }

// Zajednička pravila registracije

public double izracunajCijenuRegistracije() {
double cijena = 100.0; // osnovna cijena
if (godinaProizvodnje < 2010) cijena += 30.0;
if (kubikaza > 2000) cijena += 50.0;
return cijena;
}
public String info() {
return "Proizvođač: " + proizvodjac + " | Godina: " + godinaProizvodnje +" | Kubikaža: " + kubikaza + " | Boja: " + boja;
}
}
// Klasa za automobil

class Automobil extends Vozilo {
private int brojVrata;
private String tipMotora; // npr. "benzin", "dizel", "hibrid"
public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza,String boja, int brojVrata, String tipMotora) {
super(proizvodjac, godinaProizvodnje, kubikaza, boja);
this.brojVrata = brojVrata;
this.tipMotora = tipMotora;
} // getteri i setteri za nove atribute 
public int getBrojVrata() { return brojVrata; }
public void setBrojVrata(int brojVrata) { this.brojVrata = brojVrata; }
public String getTipMotora() { return tipMotora; }
public void setTipMotora(String tipMotora) { this.tipMotora = tipMotora; }
@Override
public double izracunajCijenuRegistracije() {
double cijena = super.izracunajCijenuRegistracije();
if (tipMotora != null && tipMotora.equals("dizel")) {
cijena += 20.0;
}
return cijena;
}
@Override
public String info() {
return "[Automobil] " + super.info() + " | Broj vrata: " + brojVrata + " | Tip motora: " + tipMotora;
}
}

//Klasa za kamion
class Kamion extends Vozilo {
private double kapacitetTereta; // npr. u tonama
private boolean prikolica;
public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza,String boja, double kapacitetTereta, boolean prikolica) {
super(proizvodjac, godinaProizvodnje, kubikaza, boja);
this.kapacitetTereta = kapacitetTereta;
this.prikolica = prikolica;
}
public double getKapacitetTereta() { return kapacitetTereta; }
public void setKapacitetTereta(double kapacitetTereta) {this.kapacitetTereta = kapacitetTereta; }
public boolean isPrikolica() { return prikolica; }
public void setPrikolica(boolean prikolica) { this.prikolica = prikolica; }

@Override
public double izracunajCijenuRegistracije() {
double cijena = super.izracunajCijenuRegistracije();
if (prikolica) cijena += 50.0;
return cijena;
}
@Override
public String info() {
return "[Kamion] " + super.info() +" | Kapacitet tereta: " + kapacitetTereta + " | Prikolica: " + (prikolica ? "da" : "ne");
}
}
//Klasa za kombi
class Kombi extends Vozilo {
private int kapacitetPutnika;
public Kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int kapacitetPutnika) {
super(proizvodjac, godinaProizvodnje, kubikaza, boja);
this.kapacitetPutnika = kapacitetPutnika;
}
public int getKapacitetPutnika() { return kapacitetPutnika; }
public void setKapacitetPutnika(int kapacitetPutnika) {
this.kapacitetPutnika = kapacitetPutnika; }
@Override
public double izracunajCijenuRegistracije() {
double cijena = super.izracunajCijenuRegistracije();

if (kapacitetPutnika > 8) cijena += 30.0;
return cijena;
}
@Override
public String info() {
return "[Kombi] " + super.info() +
" | Kapacitet putnika: " + kapacitetPutnika;
}
}
// Glavna, tesna klasa

public class Main {
public static void main(String[] args) {
Vozilo[] vozila = new Vozilo[5];
vozila[0] = new Automobil("Volkswagen", 2008, 1896, "siva", 5, "dizel");
vozila[1] = new Automobil("Toyota", 2018, 1800, "crna", 5, "benzin");
vozila[2] = new Kamion("MAN", 2012, 4800, "bijela", 12.0, true);
vozila[3] = new Kamion("Scania", 2005, 5200, "plava", 15.5, false);
vozila[4] = new Kombi("Ford", 2016, 2200, "crvena", 9);
System.out.println(" PODACI I REGISTRACIJE ");
for (Vozilo v : vozila) {
System.out.printf("%s%nUkupna cijena registracije: %.2f€%n%n",
v.info(), v.izracunajCijenuRegistracije());
}
}
}
