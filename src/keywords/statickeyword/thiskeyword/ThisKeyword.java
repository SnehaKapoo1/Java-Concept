package keywords.statickeyword.thiskeyword;

/*
1) this: to refer current class instance variable

:-> The this keyword can be used to refer current class instance variable.
        If there is ambiguity between the instance variables and parameters,
        this keyword resolves the problem of ambiguity.
*/

public class ThisKeyword {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Sneha kapoor", 68000f);
        student1.display();

        Student student2=new Student(112,"sumit",6000f);
        student2.display();

        Solution sol1 = new Solution(1, "Sneha kapoor", 68000f);
        sol1.display();

        Solution sol2=new Solution(112,"sumit",6000f);
        sol2.display();
    }

   /* In this example, parameters
     (formal arguments) and instance variables are same.
      So, we are using this keyword to distinguish local variable and instance variable.*/
    static class Student{
        int rollno;
        String name;
        float fee;
        Student(int rollno,String name,float fee){
            rollno=rollno;
            name=name;
            fee=fee;
        }
        void display(){System.out.println(rollno+" "+name+" "+fee);}
    }

    static class Solution{
        int rollno;
        String name;
        float fee;
        Solution(int rollno,String name,float fee){
            this.rollno=rollno;
            this.name=name;
            this.fee=fee;
        }
        void display(){
            System.out.println(rollno+" "+name+" "+fee);
        }
    }
}
