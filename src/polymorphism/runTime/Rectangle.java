package polymorphism.runTime;

public class Rectangle extends Shapes{
    @Override
    void area() {
        System.out.println("Area of rectangle is 2 * (length + breadth)");
    }
}
