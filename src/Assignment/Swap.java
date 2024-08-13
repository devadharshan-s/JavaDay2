package Assignment;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        //Doing XOR cancels out again
        //Try it out by subsituting equation of a in b.
        a = a ^ b;
        System.out.println("a = " + a + ", b = " + b);
        b = a ^ b;
        System.out.println("a = " + a + ", b = " + b);
        a = a ^ b;

        System.out.println("a = " + a + ", b = " + b);
    }
}
