import java.util.Scanner;                      //* Omogucava korisniku unos duzine niza
                                         //* svaki element predstavlja broj bodova na ispitu 
public class BodoviNaIspitu {               //* onda stampaj prosjecni broj bodova i najmanji element u nizu 
    public static void main(String[] args) {       //* tj vrijednost i indeks
      Scanner sc = new Scanner(System.in);
      
 // Unos dužine niza
      
 System.out.print("Unesi broj studenata (dužinu niza): ");
 int n = sc.nextInt();
 int[] bodovi = new int[n];
 
 // Unos elemenata niza
 
 for (int i = 0; i < n; i++) {
 System.out.print("Unesi broj bodova za studenta " + (i
+ 1) + ": ");
 bodovi[i] = sc.nextInt();
 }
 
//Računanje prosjeka
 
double suma = 0;
for (int b: bodovi) {
suma += b;
}
double prosjek = suma / n;

// Pronalaženje najmanjeg elementa i njegovog indeksa

int minVrijednost = bodovi[0];
int minIndeks = 0;
for (int i = 1; i < n; i++) {
if (bodovi[i] < minVrijednost) {
minVrijednost = bodovi[i];
minIndeks = i;
}
}

//Ispis rezultata

System.out.println("\nProsječan broj bodova: " + prosjek);
System.out.println("Najmanji broj bodova: " +
minVrijednost);
System.out.println("Indeks najmanjeg elementa: " +
minIndeks);