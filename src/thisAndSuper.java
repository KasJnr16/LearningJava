import java.util.Scanner;

class A{
    public A(){
        super();
        System.out.println("In the A constructor");

    }

    public A(int a){
        super();
        System.out.println("In the A int constructor");
    }

    public void show(String name){
        System.out.print(name);
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In the B constructor");
    }
    public B(int a){
        super(a);
            System.out.println("In the B int constructor");
    }

    public void show(String name){
        System.out.print("In In show B "+ name);

    }

}

public class thisAndSuper{
    public static void main(String []args){
        A obj = new B(1);


    }

}