package inheritance.basic.single;

public class Box {
    int l;
    int b;
    int w;
    Box(){
        System.out.println("Box without parameterize constructor.....");
        this.l = 1;
        this.b = 1;
        this.w = 1;
    }
    public Box(int l, int b, int w) {
        this.l = l;
        this.b = b;
        this.w = w;
    }
    Box(Box old){
        System.out.println("Box object parameterize constructor.....");
       this.b = 2;
    }
}
