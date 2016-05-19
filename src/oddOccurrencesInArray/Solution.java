package oddOccurrencesInArray;


public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result = result ^ A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();

        int[] A1 = {3, 8, 9, 7, 6};
        int[] A = {3, 8, 3, 9, 8};
        
        int B = s.solution(A);
        
        System.out.println(B);


    }

}
