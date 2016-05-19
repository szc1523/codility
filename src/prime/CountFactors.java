package prime;
// cannot pass the last performance test, it's said 
// that script languages like python can past ....
// should use a sqrt(N) to elimate the multiplication in the while()!!!

public class CountFactors {
    public int solution(int N) {
        // write your code in Java SE 8
        if (N == 1) return 1;
        int i = 1;
        int cnt = 0;
        
        while (i * i < N) {
            if (N % i == 0)  cnt += 2;
            i++;
        }
        if (i * i == N) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CountFactors s = new CountFactors();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A = {3, 2 ,1, 0};
        int[] B = {0, 0, 0, 0, 0};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";

        int   C = s.solution(6);
        System.out.println(C);
        
/*        for ( int i = 0; i < B.length; i++)
            System.out.println(B[i]);*/

    }

}
