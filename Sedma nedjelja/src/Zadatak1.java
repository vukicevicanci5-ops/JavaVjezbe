/*Uvoznika različitih linija proizvoda, potrebno je kreirati sistem
za upravljanje proizvodima. Proizvodi se dijele u tri kategorije: Garderoba, Hemijski proizvodi i Hrana. Svaka
kategorija ima svoje specificne atribute i pravila za računanje maloprodajne cijene:
a. Garderoba: Atribut - Materijal proizvodnje, Sezona.
Pravilo za obračun cijene: Uvozna cijena uvećana za maržu od 5 %
b. Hemijski proizvodi: Atribut - Temperatura skladištenja, Zapaljivo.
Pravilo za obračun cijene: Uvozna cijena uvećana za maržu od 12.5 % ukoliko
je proizvod zapaljiv a ukoliko nije 10%
c. Hrana: Atribut - Broj kalorija, Datum rok upotrebe.
Pravilo za obračun cijene: Uvozna cijena uvećana za maržu od 5 % ukoliko je
rok trajanja manji od 6 mjeseci a ukoliko nije 10%
Osim unosa samih proizvoda, potrebno je omogućiti i sledeće:
∙ Prikaz svih informacija za sve proizvode,
∙ Prikaz maloprodajne cijene za sve proizvode
∙ Na osnovu odabrane grupe proizvoda prikazati prosječnu maloprodajnu cijenu.*/ 

import java.util.ArrayList; // samo za ArrayList varijantu
class Proizvod {
private String opis;
private String barkod;
private String zemljaProizvodnje;
private int godinaProizvodnje;
private double uvoznaCijena;
public Proizvod(String opis, String barkod, String zemljaProizvodnje, int
godinaProizvodnje, double uvoznaCijena) {
this.opis = opis;
this.barkod = barkod;
this.zemljaProizvodnje = zemljaProizvodnje;
this.godinaProizvodnje = godinaProizvodnje;
this.uvoznaCijena = uvoznaCijena;
}
public String getOpis() { return opis; }
public double getUvoznaCijena() { return uvoznaCijena; }
public double izracunajMaloprodajnuCijenu() {
return uvoznaCijena;  } 

public String osnovneInfo() {
return "Opis: " + opis + " | Barkod: " + barkod + " | Zemlja: " +
zemljaProizvodnje + " | Godina: " + godinaProizvodnje + " | Uvozna: " +
uvoznaCijena + "€";}
public String toString() {
return osnovneInfo();
}
}
// Klasa za garderobu
class Garderoba extends Proizvod {
private String materijal;
private String sezona;
public Garderoba(String opis, String barkod, String zemljaProizvodnje, int
godinaProizvodnje, double uvoznaCijena, String materijal, String sezona) {
super(opis, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
this.materijal = materijal;
this.sezona = sezona;
}
public double izracunajMaloprodajnuCijenu() {
return getUvoznaCijena() * 1.05;
}
public String toString() {
return "[Garderoba] " + osnovneInfo() + " | Materijal: " + materijal + " Sezona: " + sezona;
}
}
// Klasa za hemijske proizvode
class HemijskiProizvod extends Proizvod {
private double temperaturaSkladistenja;
private boolean zapaljivo;
public HemijskiProizvod(String opis, String barkod, String
zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena, double
temperaturaSkladistenja, boolean zapaljivo) {
super(opis, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
this.temperaturaSkladistenja = temperaturaSkladistenja;
this.zapaljivo = zapaljivo;
}
public double izracunajMaloprodajnuCijenu() {
double faktor = zapaljivo ? 1.125 : 1.10;
return getUvoznaCijena() * faktor;
}
public String toString() {
return "[Hemijski] " + osnovneInfo() +" | Temp. skladištenja: " + temperaturaSkladistenja + "°C | Zapaljivo: " + (zapaljivo ? "da" : "ne");

//Klasa Hrana
class Hrana extends Proizvod {
private int brojKalorija;
private int mjeseciDoRoka; // broj mjeseci do isteka roka
public Hrana(String opis, String barkod, String zemljaProizvodnje, int
godinaProizvodnje, double uvoznaCijena, int brojKalorija, int mjeseciDoRoka) {
super(opis, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
this.brojKalorija = brojKalorija;
this.mjeseciDoRoka = mjeseciDoRoka;
}
public double izracunajMaloprodajnuCijenu() {
double faktor = (mjeseciDoRoka < 6) ? 1.05 : 1.10;
return getUvoznaCijena() * faktor;
}
public String toString() {
return "[Hrana] " + osnovneInfo() +" | Kalorije: " + brojKalorija +" | Rok (mjeseci): " + mjeseciDoRoka;
}
}
//Glavna klasa
public class Main {
public static void main(String[] args) {

System.out.println(" VARIJANTA SA NIZOM");
Proizvod[] proizvodi = new Proizvod[6];
proizvodi[0] = new Garderoba("Muška jakna", "111-AAA", "Turska", 2024,
80.0, "pamuk", "jesen/zima");
proizvodi[1] = new Garderoba("Ženska majica", "112-BBB", "Bangladeš",
2025, 12.0, "pamuk", "proljeće/ljeto");
proizvodi[2] = new HemijskiProizvod("Sredstvo za čišćenje", "221-CCC",
"Poljska", 2025, 3.5, 20.0, false);
proizvodi[3] = new HemijskiProizvod("Rastvarač X", "222-DDD",
"Njemačka", 2025, 9.0, 15.0, true);
proizvodi[4] = new Hrana("Mlijeko 1L", "331-EEE", "Srbija", 2025, 0.7, 640, 2);
proizvodi[5] = new Hrana("Maslinovo ulje 0.5L", "332-FFF", "Italija",2024, 4.2, 4500, 12);
prikaziProizvode(proizvodi);
prikaziCijene(proizvodi);
prikaziProsjek(proizvodi); }

//Metode za niz
public static void prikaziProizvode(Proizvod[] niz) {
for (Proizvod p : niz) System.out.println(p);
}
public static void prikaziCijene(Proizvod[] niz) {
for (Proizvod p : niz)
System.out.printf("%s | Maloprodajna cijena: %.2f€%n", p.getOpis(),
p.izracunajMaloprodajnuCijenu());
}
public static void prikaziProsjek(Proizvod[] niz) {
System.out.printf("Garderoba: %.2f€%n", prosjekZaGrupu(niz,
"garderoba"));
System.out.printf("Hemijski proizvodi: %.2f€%n", prosjekZaGrupu(niz,
"hemijski"));
System.out.printf("Hrana: %.2f€%n", prosjekZaGrupu(niz, "hrana"));
}
//Metode za array list
public static void prikaziProizvode(ArrayList<Proizvod> lista) {
for (Proizvod p : lista) System.out.println(p);
}
public static void prikaziCijene(ArrayList<Proizvod> lista) {
for (Proizvod p : lista)
System.out.printf("%s | Maloprodajna cijena: %.2f€%n", p.getOpis(),
p.izracunajMaloprodajnuCijenu());
}
public static void prikaziProsjek(ArrayList<Proizvod> lista) {
System.out.printf("Garderoba: %.2f€%n", prosjekZaGrupu(lista,
"garderoba"));
System.out.printf("Hemijski proizvodi: %.2f€%n", prosjekZaGrupu(lista,
"hemijski"));
System.out.printf("Hrana: %.2f€%n", prosjekZaGrupu(lista, "hrana"));
}
//Pomocne metode
public static double prosjekZaGrupu(Proizvod[] niz, String grupa) {
double suma = 0; int broj = 0;
for (Proizvod p : niz)
if (pripadaGrupi(p, grupa)) { suma +=
p.izracunajMaloprodajnuCijenu(); broj++; }
return broj == 0 ? 0 : suma / broj;
}
public static double prosjekZaGrupu(ArrayList<Proizvod> lista, String grupa)
{
double suma = 0; int broj = 0;
for (Proizvod p : lista)
if (pripadaGrupi(p, grupa)) { suma +=
p.izracunajMaloprodajnuCijenu(); broj++; }
return broj == 0 ? 0 : suma / broj;
}
private static boolean pripadaGrupi(Proizvod p, String grupa) {
grupa = grupa.toLowerCase();
if (grupa.equals("garderoba") && p instanceof Garderoba) return true;
if (grupa.equals("hemijski") && p instanceof HemijskiProizvod) return
true;
if (grupa.equals("hrana") && p instanceof Hrana) return true;
return false;
}
