package abstraction.abstract_example.interface_example.multiple_inheritance;

public interface A {
    void meth(String name);
}

interface B {
    void meth(String name, int n);
}

interface C{
    void meth(String n);
}

class D implements A, B {

    @Override
    public void meth(String name) {
        System.out.println(name);
    }

    @Override
    public void meth(String name, int n) {
        System.out.println(name + " " + n);
    }
}

class E implements A, C{

    @Override
    public void meth(String name) {

    }
}

























