package caterpillarMethod;


public class AbsDistinct {
    public int solution(int[] A) {
        int N = A.length;
        int cnt = 0;
        int head = 0; 
        int tail = N - 1;
        long curMax = Long.MAX_VALUE;
        
        while (true) {
            if (head > tail) return cnt;
            
            long H = Math.abs((long)A[head]);
            long T = Math.abs((long)A[tail]);
            if (H > T) {
                if (H < curMax){
                    head++;
                    cnt++;
                    curMax = H;
                }
                else {
                    head++;
                }
            }
            else if (H < T) {
                if (T < curMax) {
                    tail--;
                    cnt++;
                    curMax = T;
                }
                else {
                    tail--;
                }
            }
            else if (H == T) {
                if (T < curMax) {
                    head++;
                    tail--;
                    cnt++;
                    curMax = T;
                }
                else {
                    head++;
                    tail--;
                }
            }
        }
    }
    
    
    
    
    public static void main(String[] args) {
        AbsDistinct s = new AbsDistinct();
    
        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A = {-5, -3, -1, 0, 3, 6, 100};
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
