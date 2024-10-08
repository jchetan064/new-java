/**
 * Method Overloading -> Function / Method name is same but no. of argument(parameter) , type of argument , order of argument , return type is different. 
 */
class Calculator{

    public int add( int a , int b , int c ){
        return a + b + c;
    }

    public int add( int a , int b ){
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

}

public class _03_MethodOverloading {

    public static void main(String[] args) {
        
        Calculator obj = new Calculator();
        

        int ADD = obj.add(10 , 20 , 30);
        System.out.println("The Addition is "+ADD);        

        int ADD1 = obj.add(10 , 20);
        System.out.println("The Addition is "+ADD1);


        double ADD2= obj.add(10.7 , 20.87);
        System.out.println("The Addition is "+ADD2);
    }
}