package a19_생성자오버로딩_생성자연쇄호출;

// 문제 : 아래와 같이 출력되도록 해보세요.[정답]

public class Main19_2 {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5
    }

    static class 계산기 {
        int 더하기(int a, int b) {
            return a + b;
        }

        // 이 메서드는 생략가능
        int 더하기(int a, int b, int c) {
            return a + b + c;
        }

        double 더하기(double a, int b, int c) {
            return a + b + c;
        }
    }
}