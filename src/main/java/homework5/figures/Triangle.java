package src.main.java.homework5.figures;

public class Triangle implements Area{

    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double square() {
        double area = (side1+side2+side3)/2.0d;
        double square = Math.sqrt(area* (area - side1) * (area - side2) * (area - side3));
        return square;
    }
}


