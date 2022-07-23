package a14_생성자1;

// 문제 : 아래와 같이 출력 되도록 해주세요.

public class Main14_4 {
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }

    static class 사람 {
        팔 a왼팔;

        사람() {
            a왼팔 = new 팔();

            // 만약에 팔 클래스에 `팔` 생성자를 못 쓰는 상황이다.
            // 그렇다면 아래와 같은 코드가 필요하다.
            //a왼팔.길이 = 100;
        }

        void 걷다() {
            System.out.println("사람이 걷습니다.");
        }
    }

    static class 팔 {
        int 길이;

        팔() {
            this.길이 = 100;
        }
    }
}