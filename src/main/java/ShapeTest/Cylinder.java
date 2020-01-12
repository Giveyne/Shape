package ShapeTest;

public class Cylinder extends SolidOfRevolution{

    private double height;

    public double getHeight() {
        return height;
    }

    public Cylinder (double radius, double height){
        super(Math.PI*radius*radius*height);
        this.height = height;

    }

}
