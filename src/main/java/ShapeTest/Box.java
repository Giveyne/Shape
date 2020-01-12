package ShapeTest;

import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double volume1;

    public Box(double volume) {
        super(volume);
        this.volume1 = volume;
    }


    public boolean add(Shape shape) {
        if (volume1 >= shape.getVolume()) {
            shapes.add(shape);
            volume1 -= shape.getVolume();
            return true;
        } else {
            return false;
        }

    }
}
