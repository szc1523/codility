package greedy;

public class MaxNonoverlappingSegments {
    public int solution(int[] A, int[] B) {
        int N = A.length;
        if (N < 2) return N;
        int cnt = 1;
        int index = 1;
        int end = B[0];
        
        while (index >= 0) {
            while (index < N && A[index] <= end) {
                index++;
            }
            if (index == N) break;
            cnt++;
            end = B[index];
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaxNonoverlappingSegments s = new MaxNonoverlappingSegments();
        
        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A4 = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
        int[] A = {1, 3, 7, 9, 9};
        int[] B = {5, 6, 8 ,9 ,10};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 4;
    
        int  C = s.solution(A, B);
        System.out.println(C);

    }

}
