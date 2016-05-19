package prime;

public class CountSemiPrimes {
    public int[] solution(int N, int[] P, int[] Q) {
        // write your code in Java SE 8
        int M = P.length;
        int[] prime = new int[N + 1];
        
        int i = 2;
        while (i * i <= N) {
            if (prime[i] == 0) {
                int k = i * i;
                while (k <= N) {
                    if (prime[k] == 0) prime[k] = i;
                    else 
                    k += i;
                }
            }
            i++;
        }
        int[] prefix = new int[N + 1];
        
        for (int j = 2; j < N + 1; j++) {
            if (prime[j] != 0 && prime[j / prime[j]] == 0)
                prefix[j] = prefix[j - 1] + 1;
            else 
                prefix[j] = prefix[j - 1];
        }
        
        int[] result = new int[M];
        for (int j = 0; j < M; j++) {
            result[j] = prefix[Q[j]] - prefix[P[j] - 1];
        }
        
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CountSemiPrimes s = new CountSemiPrimes();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A = {1, 5 ,16};
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 30;

        int[]  C = s.solution(N, A, B);
        //System.out.println(C);
        
        for ( int i = 0; i < A.length; i++)
            System.out.print(C[i] + "  ");

    }

}
