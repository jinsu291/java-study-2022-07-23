package a27_배열2;

// 문제 : a와 b와 c를 저장하는 char 배열을 만들어주세요.[정답]

import java.util.ArrayList;

public class Main27_2 {
    public static void main(String[] args) {
        char[] chars = new char[3];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';

        for ( int i = 0; i < chars.length; i++ ) {
            System.out.println(chars[i]);
        }
    }
}