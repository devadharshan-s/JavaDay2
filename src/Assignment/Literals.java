package Assignment;

public class Literals {
    public static void main(String[] args) {
        int decimal = 123;
        int octal = 0123;
        int hex = 0x7F;

        double d = 1.00;
        float f = 1.5623f;

        char c = 'A';
        char uC = '\u03A9';

        String s = "hello";

        boolean b = true;

        System.out.println("Decimal: " + decimal + " Octal: " + octal + " Hex: " + hex);
        System.out.println("Double: " + d + " Float: " + f);
        System.out.println("Character: " + c + " Unicode Character: " + uC);
        System.out.println("String: " + s);
        System.out.println("Boolean: " + b);
    }
}
