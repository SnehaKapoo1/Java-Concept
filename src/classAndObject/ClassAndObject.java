package classAndObject;

public class ClassAndObject {
    public static void main(String[] args) {
        //Array of student type
        Student[] students = new Student[5];

        //just declaring the reference to the object
        /*Student stu1;
        System.out.println(Arrays.toString(students));*/

        Student s1 = new Student(18, "Sneha kapoor", 76.8f);
        /*System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);*/

        Student s2 = new Student();
        System.out.println(s2.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        Student random = new Student(s1);
        System.out.println(random.rollNo);
        System.out.println(random.name);
        System.out.println(random.marks);

        /*s1.rollNo=5;
                        //s1.rollNo=9;
        s1.name ="Sneha";
        s1.marks = 88.9f;
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);*/
    }

    //create a class
    //for every single student
    static class Student{
        int rollNo;   /*instance variables*/
        String name;
        float marks;

        Student(int rollNo, String name, float marks){
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        Student(){
            this.rollNo =1;
            this.name = "kunal kushwaha";
            this.marks = 79.0f;
        }

        //Constructor that takes value from another object
        Student(Student other){
            this.name = other.name;
            this.rollNo = other.rollNo;
            this.marks = other.marks;
        }

    }
}
