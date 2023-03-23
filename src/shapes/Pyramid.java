package shapes;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double square, double height) {
        super(square * height / 3.0);
        this.s = square;
        this.h = height;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
