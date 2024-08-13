package Assignment;

public class While {
    public static void main(String[] args) {
        int no = 3;

        while(no < 4)
            System.out.println(no++);

        do{
            System.out.println(no++);
        }while (no < 4);
    }
}
