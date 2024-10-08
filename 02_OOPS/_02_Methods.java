/**
 * _02_Methods
*/

class Computer {
    public void Insider(){
        System.out.println("I am Insider 1");
    }

    public String Insider2( int price ){
        if( price >= 10 ){
            System.out.println("I am Insider 2");
            return "I got the Pen";
        } 
        else{
            return "Nothing";
        }
    }
    
}
public class _02_Methods {

    public static void main(String[] args) {
        
        Computer obj = new Computer();
        obj.Insider();

        String str = obj.Insider2(1);
        System.out.println(str);

        System.out.println("I am Outer");
    }
}