// Type Conversion and Type Casting 
public class _3_Type_Conversion {
    public static void main(String[] args) {

        int a = 10;
        byte b = 12;

        a = b; //conversion 
        b = (byte)a;  //Casting 
        // a small value inserted into big value 


        // System.out.println(b);
        // System.out.println(a);


        double c = 78.34567;
        float d = 663.93f;

        d = (float)c;
        c = (double)d;
        System.out.println(d);
        System.out.println(c);
    }
    
}