package src.main.java.homework5.figures;

public class Square implements Area{

    private double side;


    public Square(double side) {
        this.side = side;
    }

    @Override
    public double square() {
        double square = side * side;
        return square;
    }
}
