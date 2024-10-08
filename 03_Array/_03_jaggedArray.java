

public class _03_jaggedArray {
    public static void main(String[] args) {
         
        int nums[][] = new int[3][];    //jagged array

        nums[1] = new int[4];
        nums[2] = new int[5];
        nums[0] = new int[3];

        for( int i = 0; i < nums.length; i++ ){
            for( int j = 0; j <nums[i].length; j++ ){
                nums[i][j] = (int)(Math.random()*100);
            }
        }


        for( int n[]: nums ){
            for( int m: n ){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}





// Drawbacks:-
// - The memory allocation is contiguous.
// - The size of an array is fixed. Array size cannot be expand.
// - Searching takes time.
// - Array can store values of only same type. It can store homogeneous type value only.