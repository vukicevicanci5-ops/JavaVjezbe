package nedeljaX;

import java.util.Scanner;

public class DrugiZadatak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cijena = 0;

        while (true) {
            System.out.print("Unesite cijenu proizvoda: ");

            if (scanner.hasNextDouble()) {
                cijena = scanner.nextDouble();

                if (cijena > 0) {
                    break; 
                } else {
                    System.out.println("Cijena mora biti pozitivan broj!");
                }

            } else {
                System.out.println("Morate unijeti broj!");
                scanner.next(); 
            }
        }

        System.out.println("Cijena je uspješno prihvaćena: " + cijena);
    }
}        