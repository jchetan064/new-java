class Mobile{
    String brand;
    int price;
    // String name;
    static String name;

    // static{
    //     name = "S20";
    //     System.out.println("I am the static block");
    // }

    // public Mobile(){
    //     price = 12345;
    //     brand = "Huwai";
    //     name = "x77";
    //     System.out.println(
    //         "I am Constructor"
    //     );
    // }
    public  void show() {
        System.out.println(brand + " : " + price + " : " + name );
    }

    // Static method 

    public static void show1(Mobile obj1){
        System.out.println(obj1.brand + " : " + obj1.price + " : " + name );
    }
}

public class _05_StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        
        // Class.forName("Mobile");
        // Class.forName("Mobile");


        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 122333;
        obj1.name = "A23";

        obj1.show();
        

        Mobile.show1(obj1);

    }    
}
