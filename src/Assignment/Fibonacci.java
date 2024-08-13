package Assignment;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + ",");
        for(int i = 0; i < 9; i++){
            System.out.print(b + ",");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
