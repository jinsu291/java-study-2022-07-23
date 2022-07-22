package a07_클래스와객체4;

// 문제 : 99단을 만들어주세요

public class Main7_2 {
    public static void main(String[] args) {
        new 구구단출력기().작동();
    }
    static class 구구단출력기 {
        void 작동() {
            for ( int dan = 2; dan <= 9; dan++ ) {
                System.out.println("== " + dan + "단 ==");
                for ( int i = 1; i <= 9; i++ ) {
                    System.out.println(dan + " * " + i + " = " + dan * i);
                }
            }
        }
    }
}
