package polymorphism.overloading;

public class Case1 {
    public void m1(int a){
        System.out.println("int arg");
    }

    public void m1(float f){
        System.out.println("float arg");
    }

    public static void main(String[] args) {
        Case1 c = new Case1();
        c.m1(10);
        c.m1(10.5f);
        c.m1('a');
        c.m1(10l);
        //c.m1(10.0);

    }
}
