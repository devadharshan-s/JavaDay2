import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int v1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int v2 = sc.nextInt();
        System.out.print("Enter Operation (+,-,/,*): ");
        char op1 = sc.next().charAt(0);

        switch (op1) {
            case '+':
                System.out.println(v1 + v2);
                break;
            case '-':
                System.out.println(v1 - v2);
                break;
            case '*':
                System.out.println(v1 * v2);
                break;
            case '/':
                if(v2 == 0)
                    System.out.println("Can't Divide by Zero");
                else
                    System.out.println(v1 / v2);
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
