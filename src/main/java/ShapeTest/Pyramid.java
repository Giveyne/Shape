package ShapeTest;

public class Pyramid extends Shape{

    private double square;
    private double height;

/*    public double getHeight() {
        return height;
    }

    public double getSquare() {
        return square;
    }*/

    public Pyramid(double square, double height){
        super(square*height*1/3);
        this.height = height;
        this.square = square;
    }


   /* public double getVolume(double square, double height) {
        this.height = height;
        this.square = square;
        return 1/3*square*height;
    }*/
}
