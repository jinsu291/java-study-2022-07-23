package a24_static;

// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.[정답]

public class Main24_3 {
    public static void main(String[] args) {
        new 자동차().달리다();

        자동차 a자동차 = new 자동차();
        a자동차.달리다();
    }

    static class 자동차 {
        void 달리다() {
            System.out.println("자동차가 달립니다.");
        }
    }
}
