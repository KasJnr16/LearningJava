package Calc;

public class AdvCalc extends Calc {
//    subclass

    public void show2(){
        System.out.println("In a AdvCalc");
    }
    public int add(int n1, int n2) {
        return n1+n2+1;
    }

    public int multi(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1, int n2){
        return n1/n2;
    }
}
