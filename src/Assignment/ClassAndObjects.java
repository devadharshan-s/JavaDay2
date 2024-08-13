package Assignment;
class Car{
    String make;
    String model;
    int year;
    int price;

    void displayDetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
public class ClassAndObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "German";
        car1.model = "Audi";
        car1.year = 2018;
        car1.price = 50000;

        car1.displayDetails();

        Car car2 = new Car();
        car2.make = "American";
        car2.model = "Ford";
        car2.year = 2018;
        car2.price = 40000;

        car2.displayDetails();
    }
}
