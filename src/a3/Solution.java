/*
 * the third question pair of equal number in an array
 */

package a3;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        if (N < 2) return 0;
        Arrays.sort(A);
        long result = 0;
        int cnt = 1;
        
        for(int i = 1; i < N; i++) {
            if (A[i] == A[i - 1])
                cnt++;
            else {
                result += cnt * (cnt - 1)/2;
                cnt = 1;
            }
        }
        if (cnt > 1) 
            result += cnt * (cnt - 1)/2;
        
        if (result > 1000000000)
            result = 1000000000;
        return (int)result;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();

        int[] A1 = {Integer.MAX_VALUE};
        int[] A2 = {-4, -4, -4, -4, -4, -4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A5 = {-1, 2, -1, -1, 5, -1, 2, 2};
        int[] A = {3, 5, 6, 3, 3, 5};
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 30;

        int  C = s.solution(A);
        System.out.println(C);
        
      // for ( int i = 0; i < C.length; i++)
        //    System.out.print(C[i] + "  ");

    }
}
