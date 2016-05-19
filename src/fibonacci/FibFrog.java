/*
 * using breath first search 
 * cite github...
 */

package fibonacci;

import java.util.ArrayList;

public class FibFrog {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int[] F = new int[N + 4];
        F[0] = 0;
        F[1] = 1;
        int m = 1;
        do {
            m++;
            F[m] = F[m - 1]+ F[m - 2];
        } while(F[m] <= N + 1);
        
        boolean[] visit = new boolean[N];
        ArrayList<Status> qstat = new ArrayList<Status>();
        qstat.add(new Status(-1, 0));
        int nextTry = 0;
        
        while (true) {
            if (nextTry == qstat.size()) return -1;
            Status curStat = qstat.get(nextTry);
            nextTry++;
            int curPos = curStat.position;
            int curMov = curStat.moves;
            for (int i = m - 1; i > 0; i--) {
                int tempPos = curPos + F[i];
                if (tempPos == N) return curMov + 1;
                else if (tempPos > N || A[tempPos] == 0 || visit[tempPos] == true)
                    continue;
                qstat.add(new Status(tempPos, curMov + 1));
                visit[tempPos] = true;
            }
        }
    }
    
    class Status {
        public int position;
        public int moves;
        
        public Status(int p, int m) {
            position = p;
            moves = m;
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FibFrog s = new FibFrog();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A = {1, 1, 0, 0, 0};
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 30;

        int  C = s.solution(A);
        System.out.println(C);
        
/*        for ( int i = 0; i < A.length; i++)
            System.out.print(C[i] + "  ");*/

    }

}
