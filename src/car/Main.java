package car;

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {

        var ic = new InnerClasses(){
            @Override
            public void show() {
               System.out.println("New implementation");
            }
        };

        ic.show();

    }
}
