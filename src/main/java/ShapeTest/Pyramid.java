package ShapeTest;

public class Pyramid implements Shape{

    private double square;
    private double height;

    public double getHeight() {
        return height;
    }

    public double getSquare() {
        return square;
    }

    public Pyramid(double square, double height){
        super();
        this.height = height;
        this.square = square;
    }

    @Override
    public double getVolume() {
        return square*height*1/3;
    }
}
