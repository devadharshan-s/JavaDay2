package Assignment;

public class Person {
    int age;
    String name;
    //Constructor Overloadind
    Person(){
        //Points to Parameterized Constructor
        this(0, "");
    }
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
