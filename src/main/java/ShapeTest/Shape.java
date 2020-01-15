package ShapeTest;

interface Shape {

    double getVolume();

    public static void main(String[] args) {

        Cylinder Cyl = new Cylinder(10, 2);
        Pyramid pyramid = new Pyramid(20, 10);
        Ball ball = new Ball(10);
        Box box = new Box(1000);
        System.out.println(box.add(Cyl));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(ball));
    }

}