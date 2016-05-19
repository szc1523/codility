package coutingElements;


public class FrogRiverONe {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int covered = 0;
        int [] river = new int[X]; // to be covered

        for (int i = 0; i < A.length; i++) {
            if (river[A[i] - 1] == 0) {
                river[A[i] - 1] = 1;
                covered++;
                if (covered >= X)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FrogRiverONe s = new FrogRiverONe();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A = {1, 2};
        
        int B = s.solution(2, A);
        
        System.out.println(B);

    }

}
