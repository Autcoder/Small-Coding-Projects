package Geometrieverwaltung_pack;

public class Rechteck {
    public double length;
    public double width;
    public double area;
    public double perimeter;

    public Rechteck(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = 0;
        this.perimeter = 0;
    }

    public void calculateArea(){
        area = length * width;
    }

    public void calculatePerimeter(){
        perimeter = 2 * (length + width);
    }

    public String toString(){
        calculateArea();
        calculatePerimeter();
        return "Length: " + length + "\nWidth: " + width + "\nArea: " + area + "\nPerimeter: " + perimeter;
    }

}
