import java.util.*;


public class Namensverwaltung {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Anzahl der Namen eingeben: ");
        System.out.println("Das maximum ist 100");
        int anzahl;
        do {
            anzahl = sc.nextInt();
        } while (anzahl > 100 || anzahl < 0);


        String[] vorname = new String[100];
        String[] nachname = new String[100];
        boolean weitere_namen = false;
        boolean eingabe_fehler = true;
        do {
            for (int i = 0; i < anzahl; i++) {
                System.out.println("Vorname eingeben: ");
                vorname[i] = sc.next();
                System.out.println("Nachname eingeben: ");
                nachname[i] = sc.next();
                System.out.println();
            }
            do {
                System.out.println("Möchtest du noch weiteren Namen eingeben? (j/n)");
                String antwort = sc.next();
                try {
                    if (antwort.equals("n")) weitere_namen = false;
                    if (antwort.equals("j")) weitere_namen = true;
                } catch (Exception e) {
                    System.out.println("Falsche Eingabe");
                    eingabe_fehler = false;
                }
            } while (!eingabe_fehler);
            if (weitere_namen) {
                System.out.println("Anzahl der Namen eingeben: ");
                anzahl = sc.nextInt();
            }
        } while (weitere_namen);

        System.out.println(ausgabe(vorname, nachname, anzahl));
        System.out.println("Möchtest du nach Nachnamen suchen? (j/n)");
        String antwort = sc.next();
        if (antwort.equals("n")) {
            System.out.println("Programm beendet");
            System.exit(0);
        }
        String suchname = null;
        if (antwort.equals("j")) {
            System.out.println("Nachname eingeben: ");
            suchname = sc.next();
        }
        System.out.println(suche(vorname, nachname, suchname));

        sc.close();


    }

    public static String ausgabe(String[] vornamen, String[] nachnamen, int Anzahl) {
        StringBuilder ausgabe = new StringBuilder();
        for (int i = 0; i < Anzahl; i++) {
            ausgabe.append(vornamen[i]).append(" ").append(nachnamen[i]).append("\n");
        }
        return ausgabe.toString();
    }

    public static String suche(String[] vornamen, String[] nachnamen, String nachname) {
        StringBuilder suche = new StringBuilder();
        for (int i = 0; i < vornamen.length; i++) {
            if (nachname.equals(nachnamen[i])) {
                suche.append(vornamen[i]).append(" ").append(nachnamen[i]).append("\n");
            }
        }
        return suche.toString();
    }

}


/*
Erstelle ein Programm, das laufend Vor- und Zunamen in 2 Arrays speichert (maximale Länge der Arrays soll 100 sein).

Der Benutzer soll entscheiden können, ob er weitere Namen speichern möchte - die Anzahl der Namen muss in einer Variablen gespeichert werden.

Nach Abschluss der Eingabe von Namen sollen diese in einer Schleife wahlweise ausgegeben oder nach Nachname gesucht werden.

Erstelle dazu folgende Methoden, die auch verwendet werden sollen:

public static String ausgabe(String[] vornamen, String[] nachnamen, int Anzahl)
// gibt einen formatierten Text mit allen Vor- und Nachnamen zurück
public static String suche(String[] vornamen, String[] nachnamen, String nachname)
// gibt einen formatierten Text mit allen Vor- und (gleichen) Nachnamen zurück
// ist die Suche erfolglos, dann wird ein leerer Text zurückgegeben
 */