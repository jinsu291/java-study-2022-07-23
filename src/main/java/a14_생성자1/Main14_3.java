package a14_생성자1;

// 문제 : 아래와 같이 출력 되도록 해주세요.

public class Main14_3 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔();

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }

    static class 사람 {
        int 나이;
        팔 a왼팔;
    }

    static class 팔 {
        int 길이;

        팔() {
            길이 = 100;
        }
    }
}