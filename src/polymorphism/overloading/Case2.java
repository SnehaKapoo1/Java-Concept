package polymorphism.overloading;

public class Case2 {
    public void m1(String s){
        System.out.println("String version");
    }

    public void m1(Object obj){
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        Case2 c = new Case2();
        c.m1("sneha");
        c.m1(new Object());
        c.m1(null);

    }
}
