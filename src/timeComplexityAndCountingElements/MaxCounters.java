package timeComplexityAndCountingElements;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int [] cnts = new int[N];
        int base = 0;
        int max  = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1)
                base = max;
            else if (cnts[A[i] - 1] < base) {
                cnts[A[i] - 1] = base + 1;
                max = Math.max(cnts[A[i] - 1], max);
            }               
            else {
                cnts[A[i] - 1]++;
                max = Math.max(cnts[A[i] - 1], max);
            }
        }
        for (int i = 0; i < N; i++) {
            if (cnts[i] < base)
                cnts[i] = base;
        }
        
        return cnts;
    }
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaxCounters s = new MaxCounters();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A3 = {4, 1, 2, 3, 4};
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        
        int[] B = s.solution(5, A);
        
        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);

    }

}
