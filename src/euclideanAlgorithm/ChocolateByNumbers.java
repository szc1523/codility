package euclideanAlgorithm;


public class ChocolateByNumbers {
    public int solution(int N, int M) {
        // write your code in Java SE 8
        int G = gcd(M, N);
        int L = N / G;
        return L;
    }
    private int gcd (int a, int b) {
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChocolateByNumbers s = new ChocolateByNumbers();

        int[] A1 = {3, 1, 2, 4, 3};
        int[] A2 = {-4, -4, -4, -4, -4};
        int[] A3 = {-1 , 3, -1, 4, -1, 2, -1};
        int[] A = {1, 5 ,16};
        int[] B = {26, 5, 20};
        
        String S1 = "{[()()]}";
        String S2 = "([)()]";
        String S = ")";
        int N = 30;

        int  C = s.solution(50, 1);
        System.out.println(C);
        
/*        for ( int i = 0; i < A.length; i++)
            System.out.print(C[i] + "  ");*/

    }

}
