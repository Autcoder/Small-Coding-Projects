package Geometrieverwaltung_pack;

public class  Kreis{

    private final double radius;


    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Radius: " + radius + "\nArea: " + getArea() + "\nCircumference: " + getCircumference();
    }
}
