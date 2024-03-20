package Calc;

public class Main
{

    public static void main(String[] args)
    {
        //upcasting and downcasting
        Calc calc = new AdvCalc();
        calc.show1();

        AdvCalc cal = (AdvCalc) calc;
        cal.show2();




//        System.out.println(calc.add(2,3));
//        System.out.println(calc.sub(2,3));
//        System.out.println(calc.multi(2,3));
//        System.out.println(calc.div(2,3));
//        System.out.println(calc.power(2,3));

//        Polymorphism
//        Multiple behaviour
//        Compile time polymorphism
//        {Overloading, add(int, int) and add(int, int, int)}
//        Run time polymorphism
//        {

        final int num =8; //can't be changed
//        final - var, method, class
    }

}