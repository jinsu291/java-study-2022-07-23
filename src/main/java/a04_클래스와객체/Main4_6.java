package a04_클래스와객체;

// 문제 : 객체를 사용하지 않고 2번째 플레이어를 만들어주세요.

public class Main4_6 {

    public static void main(String[] args) {
        플레이어 a플레이어1;
        a플레이어1 = new 플레이어();
        a플레이어1.나이 = 20;
        a플레이어1.이름 = "홍길동";
        a플레이어1.직업 = "의적";

        int a플레이어2__나이 = 22;
        String a플레이어2__이름 = "홍길순";
        String a플레이어2__직업 = "의적";
    }
   static class 플레이어 {
        int 나이;
        String 이름;
        String 직업;
    }
}

