package a2;

/*
 * the second question 
 * quisi-constant subarray in an array
 */

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        if (N < 2) return 0;
        int result = 0;
        Arrays.sort(A);
        
        
        int i = 1;
        int preCnt = 1;
        int preNum = A[0];
        int curCnt = 1;
        // initailize
        while(i < N && A[i] == A[i - 1]) {
            preCnt++;
            i++;
        }
        result = preCnt;
        
        i++;
        while(i < N) {
            while (i < N && A[i] == A[i - 1]) {
                curCnt++;
                i++;
            }
            long temp = A[i - 1] - preNum;
            if (temp == 1) {
                if (result < preCnt + curCnt)
                    result = preCnt + curCnt;
            }
            else if (curCnt > result)
                result = curCnt;
            preNum = A[i - 1];
            preCnt = curCnt;        
            i++;
        }
        
        return result;
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();

        int[] A1 = {Integer.MIN_VALUE, Integer.MIN_VALUE,Integer.MIN_VALUE+1};
        int[] A2 = {6, 10, 6, 9, 7, 8};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A5 = {6, 6, 7, 8 , 9 ,10};
        int[] A = {2, 2, 3};
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 30;

        int  C = s.solution(A);
        System.out.println(C);
        
/*        for ( int i = 0; i < A.length; i++)
            System.out.print(C[i] + "  ");*/
    }

}
