package prefixSums;


public class PassingCars {
    public int solution(int[] A) {
        int cnt = 0;
        int west = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1)
                west++;
            else {
                cnt += west;
                if (cnt > 1000000000)
                    return -1;
            }
        }        
        return cnt;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PassingCars s = new PassingCars();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A3 = {4, 1, 2, 3, 4};
        int[] A4 = {0, 1, 0, 1, 1};
        int[] A = {0, 1, 0, 0, 0, 0, 1};
        
        int   B = s.solution(A);
        System.out.println(B);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
