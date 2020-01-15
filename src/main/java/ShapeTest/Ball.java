package ShapeTest;

import static java.lang.Math.*;

public class Ball implements SolidOfRevolution {
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {

        return (PI * radius * radius * 4);
    }

}
