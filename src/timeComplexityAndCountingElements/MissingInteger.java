// using PigeonHole principle to solve
// there are N interger in the input
// so the answer lies in the first N+1 positive integers
package timeComplexityAndCountingElements;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean [] a = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length || A[i] <= 0)
                continue;                
            if (a[A[i]] == false) 
                a[A[i]] = true;
        }
        int i = 1;
        while(i < A.length + 1 && a[i]) {
            i++;
        }
                
        return i;
    }
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MissingInteger s = new MissingInteger();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {1, -3, -1, 4, 2, -3, 5, 4};
        int[] A3 = {4, 1, 2, 3, 4};
        int[] A4 = {1, 3, 6, 4, 1, 2};
        int[] A = {1};
        
        int B = s.solution(A1);
        
        System.out.println(B);

    }

}
