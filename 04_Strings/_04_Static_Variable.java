class Mobile{
    String brand;
    int price;
    // String name;
    static String name;

    public  void show() {
        System.out.println(brand + " : " + price + " : " + name );
    }
}

public class _04_Static_Variable {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        Mobile.name = "SmartPhone";
        // obj1.name = "";
        obj1.price = 10000;


        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.name = "";
        obj2.price = 8000;


        Mobile.name = "alaska";
        obj1.show();
        obj2.show();
    }
}
