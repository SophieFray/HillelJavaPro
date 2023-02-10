package src.main.java.homework5.figures;

public class Circle implements Area {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        double square = Math.PI*2*radius;
        return square;
    }
}
