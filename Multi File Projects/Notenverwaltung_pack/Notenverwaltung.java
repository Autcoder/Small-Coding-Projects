package Notenverwaltung_pack;

import java.util.Scanner;

public class Notenverwaltung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Anzahl der Noten, die eingegeben werden sollen
        System.out.println("Wie viele Noten wollen Sie eingeben?");
        int anzahl_noten = sc.nextInt();

        //Noten und Fächer werden eingegeben
        Notenverwaltung_input[] noten = new Notenverwaltung_input[anzahl_noten];
        for (int i = 0; i < noten.length; i++){
            Notenverwaltung_input n = new Notenverwaltung_input();
            System.out.println("Welches Fach hat die Note?");
            n.fach = sc.next();
            System.out.println("Wie ist die Note?");
            n.note = sc.nextInt();
            noten[i] = n;
        }

        //Noten mit Fächern ausgeben
        for (Notenverwaltung_input notenverwaltungInput : noten) {
            System.out.println(notenverwaltungInput.fach + ": " + notenverwaltungInput.note);
        }

        //Durchschnitt berechnen
        int summe = 0;
        int durchschnitt;
        for (Notenverwaltung_input notenverwaltungInput : noten) {
            summe += notenverwaltungInput.note;
        }
        durchschnitt = summe / anzahl_noten;
        System.out.println("Durchschnitt: " + durchschnitt);

        //Schlechtester und beste Note ausgeben
        int beste_note = 5;
        String beste_fach = "";
        for (Notenverwaltung_input notenverwaltungInput : noten) {
            if (notenverwaltungInput.note < beste_note) {
                beste_note = notenverwaltungInput.note;
                beste_fach = notenverwaltungInput.fach;
            }
        }
        System.out.println("Beste Note: " + beste_note + " in " + beste_fach);
        int schlechteste_note = 0;
        String schlechtestes_fach = "";
        for (Notenverwaltung_input notenverwaltungInput : noten) {
            if (notenverwaltungInput.note > schlechteste_note) {
                schlechteste_note = notenverwaltungInput.note;
                schlechtestes_fach = notenverwaltungInput.fach;
            }
        }
        System.out.println("Schlechteste Note: " + schlechteste_note + " in " + schlechtestes_fach);

        //Note eines bestimmten Fachs ausgeben
        System.out.println("Welches Fach soll gesucht werden?");
        String fach = sc.next();
        for (Notenverwaltung_input notenverwaltungInput : noten) {
            if (notenverwaltungInput.fach.equals(fach)) {
                System.out.println(notenverwaltungInput.fach + ": " + notenverwaltungInput.note);
            }
        }

        //Anzahl der Fächer mit einer bestimmten Note
        System.out.println("Welche Note soll gesucht werden?");
        int note = sc.nextInt();
        int anzahl_fach = 0;
        for (Notenverwaltung_input notenverwaltungInput : noten) {
            if (notenverwaltungInput.note == note) {
                anzahl_fach++;
            }
        }
        System.out.println("Anzahl der Fächer mit Note " + note + ": " + anzahl_fach);

        //Anzahl der Fächer mit einer note größer als der durchschnitt
        int anzahl_facher_grosser = 0;
        for (Notenverwaltung_input notenverwaltungInput : noten) {
            if (notenverwaltungInput.note > durchschnitt) {
                anzahl_facher_grosser++;
            }
        }
        System.out.println("Anzahl der Fächer mit Note größer als der durchschnitt: " + anzahl_facher_grosser);

        //Anzahl der Fächer mit einer note kleiner als der durchschnitt
        int anzahl_fach_kleiner = 0;
        for (Notenverwaltung_input notenverwaltungInput : noten) {
            if (notenverwaltungInput.note < durchschnitt) {
                anzahl_fach_kleiner++;
            }
        }
        System.out.println("Anzahl der Fächer mit Note kleiner als der durchschnitt: " + anzahl_fach_kleiner);


        sc.close();


    }
}

/*
Schreiben Sie ein Java-Programm, das die Noten von unterschiedlichen Fächern einlesen kann und unterschiedliche Ausgaben erzeugt.
Verwenden Sie Schleifen, Datentypen und Arrays, um die Aufgabe zu lösen.

Anforderungen:

Erstellen Sie einen Array, in dem die Noten und das Fach zusammen gespeichert werden.

Verwenden Sie eine Schleife, um die Noten und das Fach einzugeben.
Achtung verwenden Sie für die Eingabe des Faches nextLine() und für die Eingabe der Note nextInt() und legen Sie pro Schleifendurchlauf ein neues Scanner-Objekt an.

Berechnen Sie den Durchschnitt der eingegebenen Noten und speichern Sie ihn in einer Variablen.

Verwenden Sie eine Schleife, um die Noten und den Durchschnitt auszugeben.

Geben Sie die schlechteste und die beste Note + Fach an.

Suchen Sie die Note für ein bestimmtes Fach und geben Sie diese aus.

Geben Sie die Anzahl der Fächer aus, die eine bestimmte Note haben.

Geben Sie die Anzahl der Fächer aus, die eine bessere Note als der Durchschnitt haben.

Geben Sie die Anzahl der Fächer aus, die eine schlechtere Note als der Durchschnitt haben.
 */