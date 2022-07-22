package a03_반복문;

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.

// 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    ...
    8 * 1000 = 8000
    */

public class Main3_5 {

    public static void main(String[] args) {
        int dan = 8;

        int i = 1;

        while ( i<= 1000){
            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
        }
    }

