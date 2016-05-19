package BinaryGap;

public class Solution {
    public int solution(int N) {
        int length = 32;
        int max = 0;
        int[] dig = new int[length];
        for (int i = 0; i < length; i++) {
            dig[i] = N % 2;
            N = N / 2; 
        }
        int head = 0; 
        int tail = 0;
        while (tail != length) {
            // find a head
            while (tail != length && dig[head] == 0) {
                head++;
                tail++;
            }
            if (tail == length) return max;
            
            // find a tail
            tail++;
            while (tail != length && dig[tail] == 0) {
                tail++;
            }
            if (tail == length) return max;
            else  {
                int temp = tail - head - 1;
                if (temp > max) 
                    max = temp;
                head = tail;
            }          
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();
        int A1  = 20;
        int A2 = 15;
        int A3 = 529;
        int A = 9;
        
        System.out.println(s.solution(A));
    }

}
