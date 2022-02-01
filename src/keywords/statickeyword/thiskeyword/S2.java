package keywords.statickeyword.thiskeyword;

/*4) this: to pass as an argument in the method
        The this keyword can also be passed as an argument in the method.
        It is mainly used in the event handling. Let's see the example:*/

/*Application of this that can be passed as an argument:
        In event handling (or) in a situation where we have to provide reference of a class to another one.
        It is used to reuse one object in many methods.*/


class S2 {
    void m(S2 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
    }
}