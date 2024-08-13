import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n = sc.nextInt();
        int res = 1;

        for(int i = n; i > 0; i--) res *= i;

        System.out.println("The Factorial of " + n + " is " + res);
    }
}
