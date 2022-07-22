package a03_반복문;

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.
// 조건 : 곱하는 순서를 거꾸로 해주세요.

public class Main3_8 {

    public static void main(String[] args) {
       int dan = 8;

       int i = 1000;

       while (i > 0){
           System.out.println(dan + " * " + i + " = " + dan * i);
           i--;
       }
    }
}

