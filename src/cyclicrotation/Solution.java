package cyclicrotation;

public class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0)
            return A;
        K = K % A.length;
        int[] s = new int[A.length];
        int j = 0;
        
        for (int i = A.length - K; i < A.length; i++) {
            s[j] = A[i];
            j++;
        }
        int i = 0;
        for (;j < A.length; j++) {
            s[j] = A[i];
            i++;
        }
        return s;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();

        int[] A1 = {3, 8, 9, 7, 6};
        int[] A = {3, 8};
        
        int[] B = s.solution(A, 3);
        System.out.println(B);

    }

}
