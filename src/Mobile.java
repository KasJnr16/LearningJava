import java.util.Objects;

public class Mobile
{
     String brand;
     int price;
    static String name; //shared by all instance or obj because it belongs to the class

//static block
    static {
        name = "Smart Phone";
    }
//constructor
    public Mobile(){
//        Writing database connections, or connections in general.
//        servers as a link yard for your backend and frontend.
        brand = "No brand recorded";
        price = 200;
    }

    public Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mobile mobile)) return false;
        return price == mobile.price && Objects.equals(brand, mobile.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

    static void show(Mobile obj){
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }
}
