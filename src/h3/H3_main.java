package h3;

public class H3_main {
    public static void main(String[] args) {

        int max = 10;
        int fix = 7;
        int wartend = 5;
        boolean istVoll;

        int frei = max - fix;

        if (frei > 0 && wartend > 0) {
            if (wartend >= frei) {
                wartend -= frei;
                fix += frei;
            } else {
                fix += wartend;
                wartend = 0;
            }
        }

        if (fix >= max) {
            istVoll = true;
        } else {
            istVoll = false;
        }

        System.out.println("Maximale Plätze: " + max);
        System.out.println("Vergebene Fixplätze: " + fix);
        System.out.println("Warteliste: " + wartend);
        System.out.println("Veranstaltung voll: " + istVoll);
    }
}
