package caterpillarMethod;

import java.util.Arrays;

public class CountTriangles {
    
    public int solution(int[] A) {
        int N = A.length;
        if (N < 3) return 0;
        long cnt = 0;
        Arrays.sort(A);
        
        for (int i = 0; i < N - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < N - 1; j++ ) {

                while (k < N && A[i] + A[j] > A[k]) {
                    k++;
                }
            
                cnt += k - j - 1;
            }
        }
        
        return (int)cnt;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CountTriangles s = new CountTriangles();
        
        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A = {10, 2, 5, 1, 8, 12};
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 30;
    
        int  C = s.solution(A);
        System.out.println(C);
        
    /*        for ( int i = 0; i < A.length; i++)
            System.out.print(C[i] + "  ");*/


    }

}
