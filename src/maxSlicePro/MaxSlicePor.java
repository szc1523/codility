package maxSlicePro;


public class MaxSlicePor {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxSlice = Integer.MIN_VALUE;
        int maxEnd = 0;
        
        for (int ele : A) {
            maxEnd = Math.max(ele, maxEnd + ele); 
            maxSlice = Math.max(maxSlice, maxEnd);
        }
        
        return maxSlice;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaxSlicePor s = new MaxSlicePor();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {3, 2 ,-6, 4, 0};
        int[] A = {-20, -30, -10, -15, -25};
        
        int[] B = {0, 1, 0, 0, 0};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        
        int   C = s.solution(A);
        
        
        System.out.println(C);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/


    }

}
