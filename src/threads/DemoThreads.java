package threads;

class Z{

}

class A extends Z implements Runnable{

    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Hello");
            i++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {throw new RuntimeException(e); }
        }
    }
}

class B extends Thread{

    public void run(){
        int i = 0;
        while (i < 50) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {throw new RuntimeException(e); }
            i++;
        }
    }
}

public class DemoThreads {
    public static void main(String[] a) {

        //normal ways
        Runnable obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);

        t1.start();
        obj2.start();

        //using lambda and anny class
        Runnable runnable = () -> {

            for(int i = 1; i < 50; i++){
                System.out.println("Welcome...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2 = new Thread(runnable);
        t2.start();


    }
}
