package ShapeTest;

import java.util.ArrayList;

public class Box implements Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        if (volume >= shape.getVolume()) {
            shapes.add(shape);
            volume -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
