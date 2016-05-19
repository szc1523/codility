package timeComplexityAndCountingElements;


public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] flag = new int[A.length + 1];      
        for(int i = 0; i < A.length; i++) {
            if (A[i] > A.length) 
                return 0;
            else if (flag[A[i]] == 0) {
                flag[A[i]] = 1;
            }
            else if (flag[A[i]] == 1)
                return 0;            
        }
        return 1;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PermCheck s = new PermCheck();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] A = {4, 1, 2, 3, 4};
        
        int B = s.solution(A);
        
        System.out.println(B);

    }

}
