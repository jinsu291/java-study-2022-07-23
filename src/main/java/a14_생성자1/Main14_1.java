package a14_생성자1;

// 문제 : 아래와 같이 출력 되도록 해주세요.

public class Main14_1 {
    public static void main(String[] args) {
        캐릭터 a플레이어_캐릭터;

        a플레이어_캐릭터 = new 전사();
        a플레이어_캐릭터.공격();
        // 출력 : 전사가 대검으로 공격합니다.

        a플레이어_캐릭터 = new 마법사();
        a플레이어_캐릭터.공격();
        // 출력 : 마법사가 파이어볼로 공격합니다.
    }

// 중요!!!!
// 단 1개라도 추상메서드를 노출하고 있다면 해당 클래스는 추상클래스 여야만 한다.
// 추상클래스를 사용하는 이유?
// - 쓸데없는 코딩량을 줄인다.
// - 의도를 분명히 하여 동료 개발자가 뻘짓을 하지 않게 한다.

    abstract static class 캐릭터 {
        // 추상 메서드
        abstract void 공격();
    }

    // 구상 클래스
    static class 전사 extends 캐릭터 {
        // 구상 메서드
        void 공격() {
            System.out.println("전사가 대검으로 공격합니다.");
        }
    }

    static class 마법사 extends 캐릭터 {
        void 공격() {
            System.out.println("마법사가 파이어볼로 공격합니다.");
        }
    }
}