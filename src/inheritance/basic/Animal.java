package inheritance.basic;

public class Animal {

    int legs;

    void eat(){
        System.out.println("Animal is eating");
    }

    void random(){
        System.out.println("I am a random method of animal class!! ");
    }
}

class Dog extends Animal{

    int legs;

void display(){
    System.out.println(this.legs);
    System.out.println(super.legs);
    this.random();
    super.random();
}
    void random(){
        System.out.println("I am a random method of dog class!! ");
    }

    void bark(){
        System.out.println("Dog is barking");
    }
}
