package a07_클래스와객체4;

public class Main7_4 {
    public static void main(String[] args) {
        int 결과;

        결과 = 계산기.합(10, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 30

        결과 = 계산기.합(30, 20);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 50

        결과 = 계산기.합(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 100

        결과 = 계산기.차(30, 70);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : -40

        결과 = 계산기.곱(3, 7);
        System.out.println("결과 : " + 결과);
        // 출력 => 결과 : 21
    }

    static class 계산기 {
        static int 합(int a, int b) {
            int c = a + b;

            return c;
        }

        static int 차(int a, int b) {
            return a - b;
        }

        static int 곱(int a, int b) {
            return a * b;
        }
    }
}
