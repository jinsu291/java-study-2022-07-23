package a20_super;

// 문제 : 아래와 같이 출력되도록 해보세요.[정답]

public class Main20_1 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.이름 = "홍길동";
        동물 a동물 = a사람;
        a동물.이름 = "홍길순";

        System.out.println(a사람.이름);
        System.out.println(a동물.이름);
    }

    static class 동물 {
        String 이름;
    }

    static class 사람 extends 동물 {
        String 이름;
    }
}