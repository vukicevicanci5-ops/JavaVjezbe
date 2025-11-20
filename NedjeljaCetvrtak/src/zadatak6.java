/*Kreirati program koji ce omogućiti korisniku unos dužine niza i unos elemenata toga
niza, a nakon toga:
a. Prikazati sortiran niz.
b. Omogućiti korisniku da unese broj i provjeriti da li broj postoji u nizu i
štampati odgovarajuću poruku.*/



import java.util.Scanner;

public class SortiranjeINalazenje {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 // Unos dužine niza
 System.out.print("Unesi dužinu niza: ");
 int n = sc.nextInt();
 int[] niz = new int[n];
 
 // Unos elemenata niza
 for (int i = 0; i < n; i++) {
 System.out.print("Unesi element [" + i + "]: ");
 niz[i] = sc.nextInt();}
 
 // Sortiranje niza (bubble sort)
 for (int i = 0; i < n - 1; i++) {
 for (int j = 0; j < n - i - 1; j++) {
 if (niz[j] > niz[j + 1]) {
 int temp = niz[j];
 niz[j] = niz[j + 1];
 niz[j + 1] = temp;
 }
 }
 }
 // Ispis sortiranog niza
 System.out.println("\nSortiran niz (rastuće):");
 for (int broj : niz) {
 System.out.print(broj + " ");}
 System.out.println();
 
 // Pretraga broja
 System.out.print("\nUnesi broj koji želiš da provjeriš: ");
 int trazeni = sc.nextInt();
 boolean postoji = false;
 for (int broj : niz) {
 if (broj == trazeni) {
 postoji = true;
 break;
 }}
 
//Ispis rezultata
if (postoji) {
System.out.println("Broj " + trazeni + " postoji u nizu.");
} else {
System.out.println("Broj " + trazeni + " se ne nalazi u nizu.");
}
}
}
