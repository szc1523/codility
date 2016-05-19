package timeComplexityAndCountingElements;

public class TapeEqui {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = Integer.MAX_VALUE;
        int sumB = 0;
        int sumF = A[0];
        
        for (int i = 1; i < A.length; i++) {
            sumB += A[i];
        }
        
        for (int i = 1; i < A.length; i++) {
            int Temp = Math.abs(sumB - sumF);
            result = Math.min(result, Temp);
            sumF += A[i];
            sumB -= A[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        TapeEqui s = new TapeEqui();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A = {3, 10};
        
        int B = s.solution(A1);
        
        System.out.println(B);

    }

}
