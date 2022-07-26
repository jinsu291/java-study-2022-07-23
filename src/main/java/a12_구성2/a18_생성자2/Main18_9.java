package a12_구성2.a18_생성자2;

// 문제 : 아래와 같이 출력 되도록 해보세요.[정답]
// 조건 : 오직 사람클래스만 수정 할 수 있습니다.
public class Main18_9 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        int 엄지손가락_길이 = a사람.a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 7cm
    }

    static class 사람 {
        팔 a왼팔;

        사람() {
            a왼팔 = new 팔();
            a왼팔.a손 = new 손();
            a왼팔.a손.a엄지손가락 = new 손가락();
            a왼팔.a손.a엄지손가락.길이 = 70;
        }
    }

    static class 팔 {
        손 a손;
    }

    static class 손 {
        손가락 a엄지손가락;
    }

    static class 손가락 {
        int 길이;
    }
}