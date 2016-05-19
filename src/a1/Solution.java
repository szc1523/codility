/*
 * the first question visibal nodes in a tree
 */

package a1;


public class Solution {
    public int solution(Tree T) {
        return Visable(T, Integer.MIN_VALUE);
    }
    
    public int Visable(Tree T, int max) {
        if(T == null) return 0;
        
        int num = 0;
        if(T.x >= max) {
            num = 1;
            max = T.x;
        }
        
        return num + Visable(T.l, max) + Visable(T.r, max);
    }
    
    
    class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();

        int[] A1 = {Integer.MAX_VALUE};
        int[] A2 = {-4, -4, -4, -4, -4, -4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A5 = {1, -2, 0, 9, -1, -2};
        int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 30;

        //int  C = s.solution(A2);
        //System.out.println(C);
        
/*        for ( int i = 0; i < A.length; i++)
            System.out.print(C[i] + "  ");*/

    }

}
