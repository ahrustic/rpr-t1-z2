package ba.unsa.etf.rpr.tutorijal1;

import java.util.Scanner;

public class Main {

    public static int sumaCifara (int broj){
        int sumaCifaraBroja = 0;
        while (broj != 0) {
            int cifra = (broj % 10);
            sumaCifaraBroja += cifra;
            broj /= 10;
        }

        return sumaCifaraBroja;
    }

    public static void main(String[] args) {
    Scanner ulaz = new Scanner(System.in);
    System.out.print("Unesite broj n: ");
    int n = ulaz.nextInt();
    System.out.print("Brojevi koji su djeljivi sa sumom svojih cifara su: ");
	for (int i = 1; i <= n; i++){
	    if (i % sumaCifara(i) == 0) {
	            System.out.print(i);
	            System.out.print(" ");
            }
        }
    }
}
