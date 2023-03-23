package shapes;

import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public Box(double volume) {
        super(volume);
    }

    public double getVolumeOfInternalShapes() {
        double volumeOfInternalShapes = 0;
        if (shapes.size() != 0) {
            for (Shape shape : this.shapes) {
                volumeOfInternalShapes += shape.getVolume();
            }
        }
        return volumeOfInternalShapes;
    }

    public boolean add(Shape shape) {
        double volumeOfAllShapes = 0;
        if (super.getVolume() >= this.getVolumeOfInternalShapes() + shape.getVolume()) {
            this.shapes.add(shape);
            return true;
        }
        return false;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }
}
