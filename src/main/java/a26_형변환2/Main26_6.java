package a26_형변환2;

// 문제 : 아래가 실행되도록 해주세요. 필요하다면 Main 클래스를 수정해도 됩니다.[정답]

public class Main26_6 {
    public static void main(String[] args) {
        동물 a동물 = new 사람();
        a동물.말하다();
        Object o = a동물;
        사람 a사람 = (사람) o;
        a사람.말하다();
    }

    abstract static class 동물 {
        abstract void 말하다();
    }

    static class 사람 extends 동물 {
        void 말하다() {
            System.out.println("사람이 말합니다.");
        }
    }
}
