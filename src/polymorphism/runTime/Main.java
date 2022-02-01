package polymorphism.runTime;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();

        Shapes sc = new Circle(); // known as upcasting
        sc.area();
    }
}
