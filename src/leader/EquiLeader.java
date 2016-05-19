package leader;

import java.util.Stack;

public class EquiLeader {
    
    public int solution(int[] A) {
        // write your code in Java SE 8
        // find a candidate
        int N = A.length;
        Stack<Integer> s = new Stack<Integer>();
        for (int i : A) {
            if (s.isEmpty())               s.push(i);
            else if (s.lastElement() == i) s.push(i);
            else if (s.lastElement() != i) s.pop();
        }
        if (s.isEmpty()) return 0;
        
        // test if candidate is right
        int candidate = s.lastElement();
        int counter = 0;
        int [] pfsum = new int[N];
        for (int i = 0; i < N; i++) {
            if (A[i] == candidate) {
                counter++;
                pfsum[i] = 1; // initialize prefix sum
            }
        }
        
        if (counter < N / 2) return 0;
        
        // calculate prefix sum
        s = null;
        for (int i = 1; i < N; i++)
            pfsum[i] += pfsum[i - 1];
        
        int equiCnt = 0;
        for (int i = 0; i < N; i++)
            if (pfsum[i] > (i + 1)/2 && (counter - pfsum[i]) > (N-i-1)/2 )
                equiCnt++;
        return equiCnt;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EquiLeader s = new EquiLeader();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A = {4 , 3, 4, 4, 4, 2};
        
        int[] B = {0, 1, 0, 0, 0};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        
        int   C = s.solution(A2);
        
        
        System.out.println(C);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
