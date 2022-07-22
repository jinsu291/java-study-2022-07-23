package a07_클래스와객체4;

// 문제 : 아래와 같이 출력 되도록 해주세요.

public class Main7_6 {
    public static void main(String[] args) {
       int 결과1 = Math.nToMSum(2,3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
    static class Math {
        static int nToMSum(int start, int end) {
            int sum = 0;

            int i = start;
            while (i <= end) {
                sum += i;
                i++;
            }
            return sum;
        }
    }
}
