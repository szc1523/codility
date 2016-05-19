package timeComplexityAndCountingElements;


public class FrogJump {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        return (int) Math.ceil((double) (Y - X) / D);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FrogJump s = new FrogJump();

        int[] A1 = {3, 8, 9, 7, 6};
        int[] A2 = {3, 2, 4, 1, 6};
        int[] A = {10, 85, 30};
        
        int B = s.solution(10, 69, 30);
        
        System.out.println(B);

    }

}
