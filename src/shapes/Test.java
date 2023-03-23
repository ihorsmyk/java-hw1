package shapes;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Shape ball = new Ball(5.0);
        System.out.println("volume of the ball: " + ball.getVolume());

        Shape cylinder = new Cylinder(10.0, 5.0);
        System.out.println("volume of the cylinder: " + cylinder.getVolume());

        Shape pyramid = new Pyramid(100.0, 10.0);
        System.out.println("volume of the pyramid: " + pyramid.getVolume());

        Box box = new Box(1500.0);
        System.out.println("volume of the BOX: " + box.getVolume());

        System.out.println("can I add the ball to this box? " + box.add(ball));
        System.out.println("volume of the BOX: " + box.getVolumeOfInternalShapes());

        System.out.println("can I add the cylinder to this box? " + box.add(cylinder));
        System.out.println("volume of the BOX: " + box.getVolumeOfInternalShapes());

        //in this case, the figure is not added to the box due to lack of space
        System.out.println("can I add the pyramid to this box? " + box.add(pyramid));
        System.out.println("volume of the BOX: " + box.getVolumeOfInternalShapes());
    }
}
