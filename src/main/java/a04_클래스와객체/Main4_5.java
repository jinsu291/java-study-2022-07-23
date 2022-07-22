package a04_클래스와객체;

// 문제 : 1개의 자동차가 3번 달리게 해주세요.

public class Main4_5 {

    public static void main(String[] args) {
        자동차 a자동차 = new 자동차();

        a자동차.달리다();
        a자동차.달리다();
        a자동차.달리다();
    }
   static class 자동차 {
        void 달리다(){
            System.out.println("자동차가 달립니다.");
        }
    }
}

