

public class _02_2DArray {

    public static void main(String[] args) {
        
        int nums[][] = new int[3][4];
        
        for( int i = 0; i < 3; i++ ){
            for( int j = 0; j < 4; j++ ){

                // math.random return a double so we do type casting and * by 10 for not to be all are zero
                nums[i][j] = ( int )(Math.random()*10);

                System.out.print(nums[i][j]+ " ");
            }
            System.out.println(" ");
        }



        // enhance loop
        for( int m[]: nums ){
            for( int n: m ){
                System.out.print( n + " ");
            }
            System.out.println();
        }
    }
}
