
import java.util.*;
class Area
{
    public double area(double len,double wid)
    {
        return len*wid;
    }
    public double area(double len)
    {
        return len*len;
    }

    public double circleArea(double r)
    {
        return Math.PI*r*r;
    }
    public double circleArea(double d)
    {
        double r=d/2.0;
        return Math.PI*r*r;
    }

    public double area(double base,double height)
    {
        return base*height;
    }
}
public class ShapeArea
 {

    public static void main(String[] args)
     {
        Area s=new Area();

        System.out.println("Rectangle area : " + s.area(10, 5));
        System.out.println("Square area : " + s.area(6));

        
        System.out.println("Circle area : " + s.circleArea(7));
        System.out.println("Circle area : " + s.circleArea(14));

        System.out.println("Triangle area : " + s.area(8, 5));
    }
    
}
