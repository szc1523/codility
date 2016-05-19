//demoQ37QGZ-UN8
//test!!!

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) 
            return -1;
        if (A.length == 1)
            return 0;

        long sumBack = 0;
        long sumFron = 0;
        for (int i = 1; i < A.length; i++) {
            sumBack += A[i];
        }
        for (int i = 0; i < A.length; i++) {
            if (sumBack == sumFron)
                return i;
            sumFron += A[i];
            if (i != A.length - 1)
                sumBack -= A[i+1]; 
        }
        return -1;
    }
    
    public static void main(String[] args){
        int[] A  = {-1, 3, -4, 5, 1, -6, 2, 1};        
        int[] A2 = {0};
        int[] A3 = {-1, 0};
        int[] A4 = {-1, -1, 1};
        int[] A1 = {500, 1, -2, -1, 2};
        int[] A5 = {2, -1, -2, 1, 500};
        Solution s = new Solution();
        System.out.println(s.solution(A5));
    }
    
}
