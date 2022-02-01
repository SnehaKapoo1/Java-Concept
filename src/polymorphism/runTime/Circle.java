package polymorphism.runTime;

public class Circle extends Shapes{
    @Override
    void area() {
        System.out.println("Area of circle is pie * r * r");
    }
}
