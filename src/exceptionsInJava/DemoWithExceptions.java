package exceptionsInJava;

public class DemoWithExceptions {
    public static void main(String[] a)throws Exception{

        int i = 2;
        int j = 0;

        try{

            j = 18/i;
            if(j == 0)
                throw new ArithmeticException();
        }
        catch (ArithmeticException e){

            j = 18;
            System.out.println("That's the default output");
        }
        catch (Exception e){
            System.out.println("Something is wrong.. " + e);
        }

        System.out.println("Your ans : "+j);


    }
}
