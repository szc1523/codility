package permissingele;


public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = A.length + 1;
        for (int i = 0; i < A.length; i++) {
            result = result ^ A[i] ^ (i+1);
        }  
        
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();

        int[] A1 = {3, 8, 9, 7, 6};
        int[] A2 = {3, 2, 4, 1, 6};
        int[] A = {2};
        
        int B = s.solution(A2);
        
        System.out.println(B);
    }

}
