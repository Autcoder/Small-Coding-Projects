package Autoverwaltung;
import java.util.Scanner;

public class Autoverwaltung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der Autos: ");
        int anzahlAutos = scanner.nextInt();

        Auto[] autos = new Auto[anzahlAutos];

        for (int i = 0; i < autos.length; i++){
            Auto n = new Auto();
            System.out.println("Welche Marke hat das Auto?");
            n.setMarke(scanner.next());
            System.out.println("Welches Modell hat das Auto?");
            n.setModell(scanner.next());
            System.out.println("Wie ist die PS?");
            n.setPs(scanner.nextInt());
            System.out.println("Wie schnell(kmh) ist das Auto?");
            n.setKmh(scanner.nextInt());
            autos[i] = n;
        }

        ausgabe(autos);
        System.out.println("Das schnellste Auto ist: " + schnellstes(autos).toString());
    }
    public static void ausgabe(Auto[] autos){
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i].toString());
        }
    }

    public static Auto schnellstes(Auto[] autos){
        Auto schnellstes = autos[0];
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getKmh() > schnellstes.getKmh()){
                schnellstes = autos[i];
            }
        }
        return schnellstes;
    }
}

/*
Erstelle eine Klasse namens "Auto", um Informationen über Autos zu verwalten. Dabei sollst du:

Festlegen, wie viele Autos es gibt.

Ein Array erstellen, um verschiedene Autos zu speichern.

Für jedes Auto ein Objekt erstellen und seine Eigenschaften wie PS, Farbe, Marke usw. setzen.

Möglichkeiten schaffen, um die Eigenschaften jedes Autos abzufragen.

Die erstellten Auto-Objekte in einem Array speichern.
 */
