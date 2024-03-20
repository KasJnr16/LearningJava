package interfaceInJava;

interface Computer{

    String type = "not defined";
    void code();
}

class Desktop implements Computer{

    public void code(){

        System.out.println("code, compile, run : faster");
    }
}

class Laptop implements Computer{

    public void code(){

        System.out.println("code, compile, run");
    }
}
class Developer{

    public void devApp(Computer com){

        com.code();
    }
}
public class Demo {

    public static void main(String []a){

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(desk);

        //static and final var in interfaces
        System.out.println(Computer.type);
    }
}
