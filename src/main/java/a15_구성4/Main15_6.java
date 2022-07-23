package a15_구성4;

// 문제 : 아래가 실행되도록 해주세요.


public class Main15_6 {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사 = new 홍길순();
    }

    abstract static class 전사 {
    }

    static class 홍길동 extends 전사 {
    }

    static class 홍길순 extends 전사 {
    }
}