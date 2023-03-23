package shapes;

public class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
