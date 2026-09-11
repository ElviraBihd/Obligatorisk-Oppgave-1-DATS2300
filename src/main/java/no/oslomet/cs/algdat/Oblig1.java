package no.oslomet.cs.algdat;

import java.util.NoSuchElementException;

public class Oblig1 {

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1;
    }

    // Oppgave 1
    public static int maks(int[] a) {
        if (a.length == 0) {
            throw new NoSuchElementException("Tabellen er tom!");
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }

        return a[a.length - 1];
    }
    public static int ombyttinger(int[] a) {
        int antall = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                antall++;
            }
        }

        return antall;
    }

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        // sortert stigende sjekk
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                throw new IllegalStateException("Tabellen er ikke sortert stigende!");
            }
        }

        int antall = 1;

        // teller forskjellige verdier
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                antall++;
            }
        }

        return antall;
    }

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {
        int antall = 0;

        for (int i = 0; i < a.length; i++) {
            boolean finnesFraFor = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    finnesFraFor = true;
                    break;
                }
            }

            if (!finnesFraFor) {
                antall++;
            }
        }

        return antall;
    }

    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length) {
            throw new IndexOutOfBoundsException("Ugyldig intervall!");
        }

        if (fra >= til) {
            return;
        }

        java.util.Arrays.sort(a, fra, til);
    }

    // Oppgave 5
    public static void delsortering(int[] a) {
        int venstre = 0;
        int hoyre = a.length - 1;

        // flytte oddetall til venstre og partall til høyre
        while (venstre <= hoyre) {

            while (venstre <= hoyre && a[venstre] % 2 != 0) {
                venstre++;
            }

            while (venstre <= hoyre && a[hoyre] % 2 == 0) {
                hoyre--;
            }

            if (venstre < hoyre) {
                int temp = a[venstre];
                a[venstre] = a[hoyre];
                a[hoyre] = temp;

                venstre++;
                hoyre--;
            }
        }

        // sorter oddetall og partall hver for seg
        sorter(a, 0, venstre);
        sorter(a, venstre, a.length);
    }


    // Oppgave 6
    public static void rotasjon(char[] a) {
        if (a.length <= 1) {
            return;
        }

        char siste = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = siste;
    }

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {
        StringBuilder resultat = new StringBuilder(s.length() + t.length());

        int minLengde = Math.min(s.length(), t.length());

        for (int i = 0; i < minLengde; i++) {
            resultat.append(s.charAt(i));
            resultat.append(t.charAt(i));
        }

        resultat.append(s.substring(minLengde));
        resultat.append(t.substring(minLengde));

        return resultat.toString();
    }


    public static String flett(String... s) {
        int maksLengde = 0;
        int totalLengde = 0;

        // finner lengden på den lengste strengen og total lengde
        for (String streng : s) {
            if (streng.length() > maksLengde) {
                maksLengde = streng.length();
            }

            totalLengde += streng.length();
        }

        StringBuilder resultat = new StringBuilder(totalLengde);


        // går gjennom en bokstavposisjon om gangen
        for (int i = 0; i < maksLengde; i++) {
            for (String streng : s) {
                if (i < streng.length()) {
                    resultat.append(streng.charAt(i));
                }
            }
        }

        return resultat.toString();
    }
    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}