package dynamicProgramming;


public class NumberSolitaire {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int K = 6;
        int [] dp = new int[N];
        dp[0] = A[0];
        
        for (int i = 1; i < N; i++) {         
            int max = Integer.MIN_VALUE; 
            for (int j = i - 1; j >= Math.max(i-K, 0); j--)
                if (dp[j] > max)
                    max = dp[j];
            dp[i] = A[i] + max;

        }
        
        return dp[N - 1];
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NumberSolitaire s = new NumberSolitaire();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4, -4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A5 = {1, -2, 0, 9, -1, -2};
        int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 30;

        int  C = s.solution(A2);
        System.out.println(C);
        
/*        for ( int i = 0; i < A.length; i++)
            System.out.print(C[i] + "  ");*/
    }

}
