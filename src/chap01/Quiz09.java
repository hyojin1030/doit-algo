package chap01;

public class Quiz09 {
    public static void main(String[] args) {
        int a = 10, b = 1;
        System.out.println(sumof(a, b));
    }
    static int sumof(int a, int b){
        int sum = 0;

        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for(int i = a; i <= b; i++){
            sum += i;
        }

        return sum;
    }
}
