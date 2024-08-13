import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height: ");
        double height = sc.nextDouble();
        System.out.println("Enter Weight: ");
        double weight = sc.nextDouble();
        System.out.println("Your BMI is: " + (weight / (height * height)));
    }
}
