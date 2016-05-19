package maxSlicePro;

public class MaxProfit {
    public int solution(int[] A) {
        int N = A.length;
        if (N == 0) return 0;
        
        int [] pft = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            pft[i] = A[i+1] - A[i];
        }
        
        int maxSlice = 0;
        int maxEnd = 0;
        
        for (int ele : pft) {
            maxEnd = Math.max(0, maxEnd + ele); 
            maxSlice = Math.max(maxSlice, maxEnd);
        }
        
        return maxSlice;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaxProfit s = new MaxProfit();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A = {3, 2 ,1, 0};
        int[] B = {0, 0, 0, 0, 0};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";

        int   C = s.solution(A);
        System.out.println(C);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
