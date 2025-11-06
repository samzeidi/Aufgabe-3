package p2;

public class P2_main {
    static void main(String[] args) {

        int a = 1;
        int b = 500;
        int c = 3;
        int d = 0;
        boolean E1 = (a == b);
        boolean E2 = (a == b && c == b);
        boolean E3 = (a + b) >= c;
        boolean E4 = (a + b + c) > 100;

        if (E1) d++;
        if (E2) d++;
        if (E3) d++;
        if (E4) d++;
        System.out.println("E1: " + E1);
        System.out.println("E2: " + E2);
        System.out.println("E3: " + E3);
        System.out.println("E4: " + E4);
        System.out.println("Erfüllte Eigenschaften (d): " + d);
    }

}
