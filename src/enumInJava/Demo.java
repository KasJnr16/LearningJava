package enumInJava;

enum Status{
    Running, Failed, Pending, Success;

}

enum Laptop{
    Macbook(2000), XPS, Surface(1500), ThinkPad(1800);

    private int price;

    //default constructor
    Laptop(){
        this.price = 500;
    }

    Laptop(int price) {
        this.price = price;

    }

    public int setPrice(int price){
        return this.price = price;
    }
    public int getPrice() {
        return price;
    }
}

public class Demo {

    public static void main(String []a){

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());

        //all const
        for(Laptop lapAll : Laptop.values()){
            System.out.println(lapAll + " : " + lapAll.getPrice());

        }

        Status s = Status.Running;

        //switch
        switch (s){
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Running:
                System.out.println("All Good");
                break;
            default:
                System.out.println("Done");
                break;
        }

        Status ss = Status.Pending;
        //if else
        if(ss == Status.Running)
            System.out.println("All Good");
        else if(ss == Status.Failed)
            System.out.println("Try again");
        else if(ss == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
    }
}
