public class AnalizaNiza {                                   //* kreirati klasu analizaniza 
    public static double nadjiParniPozitivniProsjek(int[] niz) {//*i novu metodu koja izracunava prosjecnu vr 
       int suma = 0;                                       //* svih pozitivnih parnih brojeva u nizu 
       int broj = 0;                                //* a onda koristeci metodu izracunati i ispisati 
       for (int x : niz) {                       /* prosjecnu vrijednost parnih brojeva unijetog niza
       if (x > 0 && x % 2 == 0) { 
           suma += x;
           broj++;
 }
 }
 if (broj == 0) {
 System.out.println("Nema pozitivnih parnih brojeva u nizu.");
 return 0;
 }
 return (double) suma / broj;
 }
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Unesi dužinu niza: ");
      int n = sc.nextInt();
      int[] niz = new int[n];
      for (int i = 0; i < n; i++) {
           System.out.print("Unesi element [" + i + "]: ");
           niz[i] = sc.nextInt();
 }
      double prosjek = nadjiParniPozitivniProsjek(niz);
      if (prosjek != 0) {
          System.out.println("\nProsječna vrijednost pozitivnih
parnih brojeva: " + prosjek);
 }
 }
