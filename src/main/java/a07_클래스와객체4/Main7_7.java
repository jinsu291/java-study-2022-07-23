package a07_클래스와객체4;

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

public class Main7_7 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.숨쉬다();
    }
    static class 사람 extends 동물 {
    }
    static class 동물 {
        void 숨쉬다() {
            System.out.println("숨쉬다.");
        }
    }
}
