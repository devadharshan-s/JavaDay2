package Assignment.Vechicles;

public class Motorcycle {
    String brand;
    String engineSize;
    String type;

    public Motorcycle(String brand, String engineSize, String type) {
        this.brand = brand;
        this.engineSize = engineSize;
        this.type = type;
    }

    public void showinfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Type: " + type);
        System.out.println();
    }
}
