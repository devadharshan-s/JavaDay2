package Assignment.Main;

public class Test {
    public static void main(String[] args) {
        //B b = new A();
        A app = new C();
        app.show();
        C app2 = (C) app;
        app2.show3();
        B app1 = (B)app;
        app1.show();
    }
}
class A{
    void show(){ System.out.println("A");}
}
class B extends A{
    void show2(){ System.out.println("B");}
}
class C extends A{
    void show3(){ System.out.println("C");}
}
