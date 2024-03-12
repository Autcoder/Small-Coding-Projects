package Geometrieverwaltung_pack;

import java.util.*;

public class Geometrieverwaltung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Choose what shape you want to calculate
        System.out.println("Which area do you want to calculate?");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");

        int choice = sc.nextInt();

        //Calculate Rectangle if input is 1
        if (choice == 1) {
            System.out.println("Enter the length of the rectangle:");
            double length = sc.nextDouble();
            System.out.println("Enter the width of the rectangle:");
            double width = sc.nextDouble();
            Rechteck r = new Rechteck(length, width);
            System.out.println(r);
        }

        //Calculate Circle if input is 2
        else if (choice == 2) {
            System.out.println("Enter the radius of the circle:");
            double radius = sc.nextDouble();
            Kreis k = new Kreis(radius);
            System.out.println(k);
        }
    }  // end of main() method
}

/*
Erstelle eine Klassenstruktur für die Verwaltung von geometrischen Formen. Implementiere mindestens zwei Klassen: Eine für Rechtecke und eine für Kreise.

Geometrieverwaltung_pack.Rechteck-Klasse:

Eigenschaften: Länge und Breite.
Methoden: Fläche berechnen, Umfang berechnen, toString.
Kreis-Klasse:

Eigenschaften: Radius.
Methoden: Fläche berechnen, Umfang berechnen, toString.
Hauptprogramm:

Erzeuge mindestens ein Geometrieverwaltung_pack für ein Rechteck und einen Kreis.
Berechne die Fläche und den Umfang jeder geometrischen Form.
Gib die Informationen zu den Formen aus.

 */
