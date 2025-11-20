public class ObrnutiNiz {                      //* kreiranje niza od 10 cijelih brojeva,
    public static void main(String[] args) {   //* popunjava brojevima od 1 do 10 a zatim 
        int[] niz = new int[10];               //* ispisuje elemente u obrnutom nizu
        
 // Popuni niz brojevima od 1 do 10
        
    for (int i = 0; i < niz.length; i++) {
        niz[i] = i + 1;
 }
 // Ispis originalnog niza
 
    System.out.println("Originalni niz:");
        for (int broj : niz) {
    System.out.print(broj + " ");
 }
 // Ispis u obrnutom redosledu
        
    System.out.println("\n\nNiz u obrnutom redosledu:");
 for (int i = niz.length - 1; i >= 0; i--) {
    System.out.print(niz[i] + " ");
 }
 }
}