package p1;

public class P1_main {
    static void main(String[] args) {
        int wuerfel = 2;

        if (wuerfel == 1) {
            System.out.println("gewonnen");

        } else if (wuerfel == 4) {
            System.out.println("gewonnen");

        } else if (wuerfel == 2) {
            System.out.println("verloren");
        } else if (wuerfel == 5) {
            System.out.println("unentschieden");
        } else {
            System.out.println("Lage unklar...");

        }

    }
}
