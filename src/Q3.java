import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius: ");
        int temp = sc.nextInt();
        System.out.println(temp * 9/5 + 32);
    }
}
