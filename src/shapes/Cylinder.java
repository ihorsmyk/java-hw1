package shapes;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double height, double radius) {
        super(Math.PI * Math.pow(radius, 2) * height, radius);
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
