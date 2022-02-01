package inheritance.basic;

public class Main {
    public static void main(String[] args) {
      /*  Dog d = new Dog();
        d.eat();
        d.bark();

        Animal a = new Dog();
        *//* a.bark();  // it will give an error because parent class cannot access the properties of child class *//*
        a.eat();*/

        B b = new B();
        b.fun();
    }
    // there are many functions in both the classes
    // you are given access to variables that are reference type i.e. Dog
    // hence, you should have access to bark function
    // this also means, that the ones we are trying to access that should be there in the Animal function as well
    /*Dog d2 = new Animal();*/
}

class A{
    int a;
    void d(){
        a =4;
        System.out.println(a);
    }
}

class B extends A{
    void fun(){
        System.out.println(this.a);
        this.d();
    }
}
