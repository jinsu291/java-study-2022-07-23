package a03_반복문;

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 2부터 9까지의 숫자를 사용하지 않고 99단 출력을 완성 해주세요.

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
    */

public class Main3_4 {

    public static void main(String[] args) {
        int dan = 8;

        int i = 1;

        System.out.println(dan + " * " + i + " = " + dan * i);
        i = i + 1; // i 의 값을 1 증가 시킨다.
        System.out.println(dan + " * " + i + " = " + dan * i);
        i += 1; // i 의 값을 1 증가 시킨다.(단축표현)
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++; // i 의 값을 1 증가 시킨다.(단축표현)
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;
        System.out.println(dan + " * " + i + " = " + dan * i);
        i++;

        }
    }

