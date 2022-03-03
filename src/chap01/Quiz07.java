package chap01;

public class Quiz07 {
    public static void main(String[] args) {
        int sum = 0, n = 7;

        for(int i = 1; i <= n; i++) {
            sum += i;
            if (i < n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = " + sum);
            }
        }
    }
}
