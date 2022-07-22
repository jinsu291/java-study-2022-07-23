package a11_클래스와객체8;

// 문제 : 아래가 실행되도록 해주세요.

public class Main11_2 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
    }

    static class 전사 {
        int 나이;
        무기 a무기;
    }

    static class 무기 {

    }

    static class 칼 extends 무기 {

    }

    static class 활 extends 무기 {

    }

}