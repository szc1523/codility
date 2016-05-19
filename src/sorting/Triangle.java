package sorting;
import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int i = 2; i < A.length; i++) {
            long P = A[i - 2];
            long Q = A[i - 1];
            long R = A[i];
            if (P + Q > R && Q + R > P && R + P > Q)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Triangle s = new Triangle();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A3 = {2, 3, 4};
        int[] A4 = {3, 4, 5};
        int[] A = {10, 2, 5, 1, 8, 20};
        
        int   B = s.solution(A4);
        System.out.println(B);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
