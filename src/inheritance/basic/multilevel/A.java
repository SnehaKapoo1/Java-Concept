package inheritance.basic.multilevel;

public class A {
    void meth1(){
        System.out.println("A");
    }
}

class B extends A{
    void meth2() {
        System.out.println("B");
    }
}

class C extends B{
    void meth3() {
        System.out.println("C");
    }
}
