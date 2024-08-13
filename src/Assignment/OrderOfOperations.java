package Assignment;

public class OrderOfOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = x++ + ++y - --x * y--;//10 + 21 - 10 * 21 => 31 - 210 => -179

        System.out.println(z);
    }
}
