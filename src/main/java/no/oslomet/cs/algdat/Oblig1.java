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

        // tabell sortert stigende sjekk
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
    public static void sorter(int[] a, int fra, int til) {throw new UnsupportedOperationException();}

    // Oppgave 5
    public static void delsortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 6
    public static void rotasjon(char[] a) {throw new UnsupportedOperationException();}

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {throw new UnsupportedOperationException();}

    public static String flett(String... s) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}