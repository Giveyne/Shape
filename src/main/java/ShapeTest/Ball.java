package ShapeTest;

import static java.lang.Math.*;

public class Ball extends SolidOfRevolution{
    public Ball (double radius){
        super (PI*radius*radius*4);
    }
}
