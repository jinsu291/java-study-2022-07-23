package a04_클래스와객체;

// 문제 : 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.

public class Main4_4 {

    public static void main(String[] args) {
        자동차 a자동차1 = new 자동차();
        a자동차1.최고속력 = 200;

        자동차 a자동차2 = new 자동차();
        a자동차2.최고속력 = 300;

        System.out.println("자동차1의 최고속력는 " + a자동차1.최고속력 + "km 입니다.");

        System.out.println("자동차2의 최고속력는 " + a자동차2.최고속력 + "km 입니다.");
    }
   static class 자동차 {
        int 최고속력;
    }
}

