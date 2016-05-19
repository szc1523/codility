
package stacksQueues;

import java.util.Stack;

public class fish {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int cnt = 0;
        Stack<Integer> s = new Stack<Integer>();
        
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                s.push(A[i]);
            }
            if (B[i] == 0) {
                while (!s.isEmpty()) {
                    int down = s.pop();
                    if (down > A[i]) {
                        s.push(down);
                        break;
                    }
                }
                if(s.isEmpty())
                    cnt++;
            }
        }
        return cnt + s.size();
    }
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        fish s = new fish();

        int[] A1 = {3, 1, 2, 4, 3};

        int[] A = {4, 3, 2, 5, 1};
        int[] B = {0, 1, 0, 0, 0};
        
        int   C = s.solution(A, B);
        System.out.println(C);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
