package abstraction.abstract_example;

public abstract class Person {
//    abstract int a =10;
//    abstract int b;

    String name;
    int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
}
class Student extends Person{
    int roll, marks;
    Student(String name, int age, int roll, int marks){
     super(name, age);
     this.roll=roll;
     this.marks=marks;
    }
}
