package leader;
import java.util.Stack;

public class Dominiator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        Stack<Integer> s = new Stack<Integer>();
        for (int ele : A) {
            if (s.isEmpty()) s.push(ele);
            else if (s.lastElement() == ele) s.push(ele);
            else s.pop();
        }
        if (s.isEmpty()) return -1;
        
        int cnt =0;
        for (int i = 0; i < N; i++) {
            if (s.lastElement() == A[i]) {
                cnt++;
            }
        }
        if (cnt <= N / 2) return -1;
        
        int value = s.lastElement();        
        s = null;
        
        int i = 0;
        while (i < N) {
            if (A[i] == value) return i;
            i++;
        }
        return -100;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dominiator s = new Dominiator();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A = {4};
        int[] B = {0, 1, 0, 0, 0};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        
        int   C = s.solution(A3);
        
        
        System.out.println(C);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
