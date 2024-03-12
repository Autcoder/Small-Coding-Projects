package Studentenverwaltung;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentenverwaltung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Studenten> studentenListe = new ArrayList<>();

        String eingabe = "";
        while (!eingabe.equals("exit")) {
            String menu = """
                    
                    Was möchten Sie tun?
                    hinzufügen
                    anzeigen
                    suchen
                    entfernen
                    exit""";
            System.out.println(menu);
            eingabe = scanner.nextLine();

            if (eingabe.equals("hinzufügen")) {
                createStudenten(studentenListe);
            }

            if (eingabe.equals("anzeigen")) {
                printStudenten(studentenListe);
            }

            if (eingabe.equals("suchen")) {
                searchStudenten(studentenListe);
            }

            if (eingabe.equals("entfernen")) {
                removeStudenten(studentenListe);
            }
        }
        System.out.println("Programm beendet");
        System.exit(0);
    }

    public static void printStudenten(ArrayList<Studenten> studentenListe) {
        System.out.println();
        for (Studenten studenten : studentenListe) {
            System.out.println(studenten.toString());
        }
    }

    public static void createStudenten(ArrayList<Studenten> studentenListe) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Vorname: ");
        String vorname = scanner.nextLine();
        System.out.println("Matrikelnummer: ");
        int matrikelnummer = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Studiengang: ");
        String studiengang = scanner.nextLine();

        Studenten studenten = new Studenten(name, vorname, matrikelnummer, studiengang);
        studentenListe.add(studenten);
        System.out.println(studentenListe);
    }

    public static void searchStudenten(ArrayList<Studenten> studentenListe) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Matrikelnummer: ");
        int matrikelnummer = scanner.nextInt();
        scanner.nextLine();
        for (Studenten studenten : studentenListe) {
            if (studenten.getMatrikelnummer() == matrikelnummer) {
                System.out.println(studenten);
            }
        }
    }

    public static void removeStudenten(ArrayList<Studenten> studentenListe) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Matrikelnummer: ");
        int matrikelnummer = scanner.nextInt();
        scanner.nextLine();
        studentenListe.removeIf(studenten -> studenten.getMatrikelnummer() == matrikelnummer);
    }

}

/*
Entwickle ein einfaches Studentenverwaltungssystem, das es einem Benutzer ermöglicht, Studenten hinzuzufügen, anzuzeigen, zu suchen und zu entfernen. Verwende dazu eine ArrayList, um die Studentenobjekte zu speichern.

Die Studentenklasse soll folgende Attribute enthalten:

Name
Matrikelnummer
Alter
Studiengang

Das Verwaltungssystem sollte folgende Funktionen unterstützen:

Hinzufügen eines neuen Studenten mit den oben genannten Attributen. (Methode)
Anzeigen aller Studenten im System. (Methode)
Suchen nach einem Studenten anhand seiner Matrikelnummer und Anzeigen seiner Informationen (Methode)
Entfernen eines Studenten aus dem System anhand seiner Matrikelnummer. (Methode)
Du kannst das System auch um weitere Funktionen erweitern, wie z.B. die Möglichkeit, die Informationen eines Studenten zu aktualisieren.
 */