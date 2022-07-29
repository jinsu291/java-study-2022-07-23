package a29_StringClass;

// 개념 : 문장을 만드는 2가지 방법

public class Explanation29_1 {
    public static void main(String[] args) {
        String s1 = "카";
        String s2 = new String("카");

        if ( s1 == s2 ) {
            System.out.println("안녕");
        }
    }
}

