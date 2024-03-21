package junittesting;

import Calc.Calc;

public class Demotesting {

    public static void main(String[] a){

        Calc c = new Calc();
        int ans = c.add(10, 3);

//        writing a testcase manually
        if(ans == 13)
            System.out.println("Test case passed");
        else
            System.out.println("Test case failed");


    }
}
