package a12_구성2.a18_생성자2;

// 문제 : 아래와 같이 출력 되도록 해보세요.[정답]
public class Main18_6 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        int a사람의_왼팔_길이 = a사람.a왼팔.길이;
        System.out.println(a사람의_왼팔_길이 + "cm");
        // 출력 : 70cm
    }

    static class 사람 {
        팔 a왼팔;

        사람() {
            this.a왼팔 = new 팔();
        }
    }

    static class 팔 {
        int 길이;

        팔() {
            길이 = 70;
        }
    }
}