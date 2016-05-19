package prefixSums;

public class CountDiv {
    public int solution(int A, int B, int K) {
        int result = B / K - A / K;
                
        return result + (A % K == 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CountDiv s = new CountDiv();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A3 = {4, 1, 2, 3, 4};
        int[] A4 = {0, 1, 0, 1, 1};
        int[] A = {0, 1, 0, 0, 0, 0, 1};
        
        int   B = s.solution(2, 9, 2);
        System.out.println(B);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
