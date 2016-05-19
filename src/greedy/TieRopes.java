package greedy;


public class TieRopes {
    public int solution(int K, int[] A) {
        // write your code in Java SE 8
        int cnt = 0;
        
        int sum = 0;
        for (int ele : A) {
            sum += ele;
            if (sum >= K) {
                cnt++;
                sum = 0;
            }
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TieRopes s = new TieRopes();
        
        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A = {1, 2, 3, 4, 1, 1, 3};
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 4;
    
        int  C = s.solution(N, A);
        System.out.println(C);
    }

}
