package chap01;

public class Quiz01 {
    public static void main(String[] args) {
        System.out.println(max4(1,2,3,4));
        System.out.println(min3(1,2,3));
        System.out.println(min4(1,2,3,4));
    }
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;

        return max;
    }
    static int min3(int a, int b, int c){
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;

        return min;
    }
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        if(min > d) min = d;

        return min;
    }
}
