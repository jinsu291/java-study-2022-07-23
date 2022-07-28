package a26_형변환2;

// 문제 : 아래코드의 오류를 수정해보세요.[정답]

public class Main26_1 {
    public static void main(String[] args) {
        long l = 200L;
        int i = (int) l; // 위험한 일에는 수동형변환(사인)을 꼭 해야 합니다.

        동물 a동물 = new 사람();
        a동물 = new 원숭이();

        원숭이 a원숭이 = (원숭이) a동물; // 위험한 일에는 수동형변환(사인)을 꼭 해야 합니다.
    }

    static class 사람 extends 동물 {
    }

    static class 원숭이 extends 동물 {
    }

    static class 동물 {
    }
}