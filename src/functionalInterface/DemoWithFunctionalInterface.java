package functionalInterface;

@FunctionalInterface
interface A{

    void show(String name);
}

interface Sum{

    int add(int i, int j);
}

public class DemoWithFunctionalInterface {

    public static void main(String[] a) {

        //lambda expressions
        A obj = name -> System.out.println(name + " in show");
        obj.show("Kassim");

        //again for other things
        Sum obj1 = (i,j) -> i+j;
        int result = obj1.add(4,5);
        System.out.println(result);

    }
}
