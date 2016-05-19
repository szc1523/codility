package stacksQueues;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        int N = S.length();
        if (N ==0) return 1;
        Stack<Character> cstack = new Stack<Character>();
        for (Character c : S.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                cstack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (cstack.isEmpty()) return 0;
                if (c == ')') {
                    if (cstack.pop() == '(') continue;                        
                    else return 0;
                }
                if (c == ']') {
                    if (cstack.pop() == '[') continue;
                    else return 0;
                }
                if (c == '}') {
                    if (cstack.pop() == '{') continue;
                    else return 0;
                }
            }
            else 
                return 0;
        }
        if (cstack.isEmpty()) 
            return 1;
        else 
            return 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Brackets s = new Brackets();

        int[] A1 = {3, 1, 2, 4, 3};

        int[] A = {4, 3, 2, 5, 1};
        int[] B = {0, 1, 0, 0, 0};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        
        int   C = s.solution(S);
        
        
        System.out.println(C);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/
    }

}
