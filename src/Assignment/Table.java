package Assignment;

public class Table {
    public static void main(String[] args) {

        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 11; j++)
                System.out.println(i + " X " + j + " = " + i*j);
            System.out.println("----------");
        }
    }
}
