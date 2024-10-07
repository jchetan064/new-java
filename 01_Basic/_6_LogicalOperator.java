/**
 * _6_LogicalOperator
 */
public class _6_LogicalOperator {

    public static void main(String[] args) {
        int a = 29;
        int b = 23;
        int c = 12;
        int d = 21;

        // Logical AND Operator
        System.out.println( a > b && c < d );
        System.out.println( a < b && c > d );
        System.out.println( a == b && c == d );

        // Logical OR Operator
        System.out.println( a > b || c < d );
        System.out.println( a > b || c > d );
        System.out.println( a == b || c == d );

        // Logical NOT Operator
        System.out.println( a != b  );

    }
}