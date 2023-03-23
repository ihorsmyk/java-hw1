package shapes;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super((4.0 / 3.0) * Math.PI * (Math.pow(radius, 3)), radius);
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

