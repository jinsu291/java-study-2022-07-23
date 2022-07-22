package a01_변수와출력;

// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

public class Main1_4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        // 변수는 한번 만들면 그 이후 부터는 계속 다른 값을 넣을 수 있습니다.
        a = 10;
        // 변수에는 오직 값을 단 하나 만 넣을 수 있다.
        b = 5;
        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}
