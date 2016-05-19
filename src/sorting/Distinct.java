package sorting;

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        if (A.length == 0)
            return 0;
        
        Arrays.sort(A);
        int cnt = 1;
        int pre = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == pre)
                continue;
            else {
                pre = A[i];
                cnt++;
            }
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Distinct s = new Distinct();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A3 = {2, 3, 4};
        int[] A4 = {3, 4, 5};
        int[] A = {2, 1, 1, 2, 3, 1, 6, 5};
        
        int   B = s.solution(A);
        System.out.println(B);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
