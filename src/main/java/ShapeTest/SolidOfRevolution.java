package ShapeTest;

public class SolidOfRevolution extends Shape {

    private double radius;

    public SolidOfRevolution(double volume) {
        super(volume);
    }

    public double getRadius() {
        return radius;
    }

    public SolidOfRevolution (double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getVolume (double radius){
        return Math.PI * radius * radius;
    }
}
