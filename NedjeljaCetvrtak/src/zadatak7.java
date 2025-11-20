/*Kreirati program koji ce kreirati novi niz, korisnik unosi dužinu niza a nakon toga:
 a. Popuniti niz sa random vrijednostima i prikazati ga.
 b. Izmijeniti svaki parni element niza da bude njegova suprotna vrijednost
 (-1*n), a svaki neparni pretvoriti u njegovu inverznu vrijednost (1/n).*/


import java.util.Random;
import java.util.Scanner;
public class ObradaNiza {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Random rand = new Random();
 
 // Unos dužine niza
 System.out.print("Unesi dužinu niza: ");
 int n = sc.nextInt();
 int[] niz = new int[n];
 
 // Popuni niz slučajnim brojevima od 1 do 10
 for (int i = 0; i < n; i++) {
 niz[i] = rand.nextInt(10) + 1; // random od 1 do 10
 }
 // Prikaz originalnog niza
 System.out.println("\nOriginalni niz:");
 for (int x : niz) {
 System.out.print(x + " ");
 }
 System.out.println();
 
 // Izmjena elemenata,parni → -1 * n,neparni → 1.0 / n
 double[] noviNiz = new double[n];
 for (int i = 0; i < n; i++) {
 if (niz[i] % 2 == 0) {
 noviNiz[i] = -1 * niz[i];
 } else {
 noviNiz[i] = 1.0 / niz[i];
 }
 }
 // Prikaz izmijenjenog niza
 System.out.println("\nIzmijenjeni niz:");
 for (double x : noviNiz) {
 System.out.printf("%.3f ", x);
 }
 }

