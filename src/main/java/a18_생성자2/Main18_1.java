package a18_생성자2;

// 오리 객체를 만들고, 객체가 만들어지면 자동으로 `오리가 생성되었습니다.` 가 출력되도록 해보세요.[정답]

public class Main18_1 {
    public static void main(String[] args) {
        사람 a사람 = new 사람(); // 사람(); => 사람 클래스의 `사람` 생성자를 호출한다.

        new 오리();
        new 오리();
        new 오리();
    }

    static class 사람 {
        // 클래스명과 이름같은 메서드는 `생성자 메서드` 라고 합니다.
        // 생성자는 리턴타입이 없다.
        // 생성자는 객체가 생성될 때 딱 한번 자동으로 호출되고 그 이후로는 호출 할 수 없다.
        사람() {
            System.out.println("사람이 태어났습니다.");
        }

        void 걷다() {
            System.out.println("사람이 걷습니다.");
        }
    }

    static class 오리 {
        오리() {
            System.out.println("오리가 생성되었습니다.");
        }
    }
}