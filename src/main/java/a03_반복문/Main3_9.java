package a03_반복문;

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.

// 출력
    /*
    8 * 1000 = 8000
    ...
    8 * -500 = -4000
    */

public class Main3_9 {

    public static void main(String[] args) {
       int dan = 8;

       int i = 1000;

       while (i > -501){
           System.out.println(dan + " * " + i + " = " + dan * i);
           i--;
       }
    }
}

