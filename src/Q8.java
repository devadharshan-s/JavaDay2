import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = 0, j = s.length() - 1;

        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                System.out.println("Not a Palindrome");
                break;
            }
            i++;
            j--;
        }

        if(i == j) System.out.println("Palindrome");
    }
}
