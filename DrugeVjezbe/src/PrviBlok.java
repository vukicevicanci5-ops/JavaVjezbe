import java.util.Scanner;

/*public class PrviBlok {

	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj katapulta:");
		int N = sc.nextInt();
		System.out.println("Unesite maksimalu distancu za domet:");
		long D = sc.nextLong();
		System.out.println("Unesite health dvorca:");
        int HD = sc.nextInt();
		System.out.println("Unesite napad katapulta:");
		int KA = sc.nextInt ();
        int brKatapultaIzDometa = 0 ;
       
        for (int i = 0; i<N ;  i++);
        	int xKatapulta = sc.nextInt();
        	int yKatapulta = sc.nextInt();
        	int menhetnRastojanje = Math.abs(xKatapulta) + Math.abs(yKatapulta); 
        	if (menhetnRastojanje <= D) { 
        		brKatapultaIzDometa++ ; 
        	if ( KA * brKatapultaIzDometa >= HD) {
        		System.out.print("Dvorac je srusen"); 
        	} else { 
        		System.out.print("Dvorac nije srusen");
        	}
        	} 
	} 
}*/
  /*        Scanner sc = new Scanner (System.in);
          System.out.println("Unesite broj trkaca:"); 
          int N= sc.nextInt();
          System.out.println("Unos centra prve kordinate:"); 
          int Cx = sc.nextInt();
          System.out.println("Unos centra druge kordinate:");
          int Cy = sc.nextInt();
          System.out.println("Unesite poluprecnik prvog kruga"); 
          int xi = sc.nextInt();
          System.out.println("Unesite poluprecnik drugog kruga:"); 
          int yi = sc.nextInt();
          int trkaciNaStazi = sc.nextInt();
          
          for (i = 0, i < N, i++) { 
        	  System.out.println("Unesite precnik prvog trkaca:"); 
          }
         */
		 public class Televizor { 
			 private int brojKanala; 
			 private int jacinaTona; //* pravljenje atributa, definisanje uvijek na pocetku, final - dodijeljenja finalna vrijednhsot, nema izmjena, za konstantne  
			 private String nazivKanala; //* glavna metoda za kreiranje instanci u klasi je konstruktor, skoro svaka klasa ima konstruktor, konstruisanje objekta 
			 
			 public Televizor (int brojKanala, int jacinaTona, string nazivKanala) { //* konstruktor ima uvijek isto ime kao i klasa, parametri su unutar konstruktora, a argumenti imaju vrijednost 
                    if (brojKanala >= 1) { 
                    	this.brojKanala = brojKanala; //* this. znaci da se preko nje pristupi atributu brojKanala, a ovo desno od = je parametar 
                    } else { 
                    	this.brojKanala = 1; //* default vrijednost ako je brojKanala koje korisnik unosi korisnik <1 
                    }
                    this.nazivKanala = nazivKanala; 
                    if (jacinaTona >= 0 && jacinaTona <= 10) {
                    	this.jacinaTona = jacinaTona;
                    }else {
                    	this.jacinaTona = 5 ;   //* Kreiranje konstruktora, mozemo sad da pravimo novi objekat\instancu zato sto nam jekontruktor dovoljan            
                    }
			 }
			 public int getBrojKanala();  {//* int - odnosi se nato koji tip podatka treba da vrati, getteri 
			       return this.brojKanala; 
			 } 
			 public int getJacinaTona(); {  
			       return this.jacinTona; 
			 }
			 public int getNazivKanala (); { 
				   return this.nazivKanala;
			 }
			 
			 
			 public void setBrojKanala (int brojKanala) { 
				 if (brojKanala >= 0) { 
					 this.brojKanala = brojKanala; 
				 } else { 
					 System.out.println("Nijeste dobro unijeli broj kanala ( >0 )"); 
					 
				 }
			 }
			 public void setJacinaTona (int jacinTona) { 
				 if (jacinaTona >= 0)
					 this.jacinaTona = jacinaTona; 
			 } else {
				 System.out.println("Potrebno je unijeti vrijednost izmedju 0 i 10.");
				 
			 }
			 
			 public void setNazivKanala (String nazivKanala) {
				 this.nazivKanala = nazivKanala; 
			 }
			 
			 public void pojacajTon() { 
				 if (this.jacinaTona < 10) { 
				 this.jacinaTona ++ ; 
			 } else { 
				 System.out.println("Jacina tona vec na maksimumu")  //* ovo nije ni getter ni setter nego metod 
			 }
				 
			public void ispis() { 
				System.out.println("Broj kanala:" +this.brojKanala + 
						            "; jacina tona:" + this.jacinaTona + 
						            "; naziv kanala:" + this.nazivKanala);
			}
			 
			 
			 public static void main (String[] args) { 
				 Televizor televizor1 = new Televizor (10, 6, "Kanala 1"); //* desno od = je kreiranje objekta, 
				 System.out.println("Broj kanala:" + televizor1.brojKanala);
				 Televizor televizor2 = new Televizor ( 15, 4, "Kanal 10"); 
				 System.out.println("Broj kanala:" + televizor2.brojKanala); //* U momentu kad se poziva konstruktor televizor1 postaje this, u drugom dijelu na televizor2 
				 //* televizor2.brojKanala = 7; lose mijenjati vrijednost atributa na ovaj nacin 
				 televizor.setBrojKanala(7); 
				 System.out.println("Broj kanala:" + televizor2.getBrojKanala); 
				 televizor1.pojacajTon(); 
				 televizor1.pojacajTon();
				 televizor1.ispis;
			 }
		 }
		


       
