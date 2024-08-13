package Assignment;

import java.util.Scanner;

public class Student {
    static int studentCount;

    static int getStudentCount(){
        return studentCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of students to be added: ");
        Student obj1 = new Student();//0
        Student obj2 = new Student();//0

        studentCount++;
        System.out.println(studentCount);//1
        studentCount++;
        System.out.println(studentCount);//2

    }
}
