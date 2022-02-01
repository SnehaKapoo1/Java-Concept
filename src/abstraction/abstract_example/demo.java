package abstraction.abstract_example;

public class demo {

    public static int b(int n, int m, String s, int[]x, int []y){
        int cnt =0, max=0;
        for(char ci: s.toCharArray()){
            for(char cj: s.toCharArray()){
                  if(ci == cj){
                      cnt++;
                  }
            }
            if(cnt > max){
                max = cnt;
            }
            cnt =0;
        }

        return max == 1? -1 : max;
    }
    public static void main(String[] args) {
        /* 1.....int x [] = {1,2,3,4};
        int y [] = {5,6,7,8};

        System.out.println(demo.b(5,4,"abaca",x, y));*/


       /* 2.......int x [] = {1,1,3,4};
        int y [] = {2,3,4,5};

        System.out.println(demo.b(5,4,"abaca",x, y));*/

        /* 3...........int x [] = {1,3,2,5,4,6};
        int y [] = {2,1,3,4,3,4};

        System.out.println(demo.b(6,6,"xzyabc",x, y));*/

        int x [] = {1,3,2,5,4,6,7};
        int y [] = {3,6,3,4,5,4};

        System.out.println(demo.b(7,7,"ijklmno",x, y));
    }
}
