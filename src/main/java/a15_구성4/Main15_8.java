package a15_구성4;

// 문제 : 아래가 실행되도록 해주세요.

public class Main15_8 {
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사.a무기 = new 활();

        a전사.공격();
        // 출력 => 홍길동이(가) 활(으)로 공격합니다.

        a전사 = new 홍길순();

        a전사.공격();
        // 출력 => 홍길순이(가) 칼(으)로 공격합니다.

        a전사.a무기 = new 창();
        a전사.공격();

        // 출력 => 홍길순이(가) 창(으)로 공격합니다.
    }

    abstract static class 무기 {
        String 무기이름;

        void 작동(String 사용자) {
            System.out.println(사용자 + "이(가) " + 무기이름 + "(으)로 공격합니다.");
        }
    }

    static class 칼 extends 무기 {
        칼() {
            무기이름 = "칼";
        }
    }

    static class 창 extends 무기 {
        창() {
            무기이름 = "창";
        }
    }

    static class 활 extends 무기 {
        활() {
            무기이름 = "활";
        }
    }

    abstract static class 전사 {
        String 이름;
        무기 a무기;

        void 공격() {
            a무기.작동(이름);
        }
    }

    static class 홍길동 extends 전사 {
        홍길동() {
            this.이름 = "홍길동";
        }
    }

    static class 홍길순 extends 전사 {
        홍길순() {
            this.이름 = "홍길순";
            this.a무기 = new 칼();
        }
    }
}