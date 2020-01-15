package ShapeTest;

public class Cylinder implements SolidOfRevolution{

    private double height;
    private double radius;

    public double getHeight() {
        return height;
    }

    public Cylinder (double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI*radius*radius*height;
    }


}
