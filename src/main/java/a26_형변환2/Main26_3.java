package a26_형변환2;

// 문제 : 아래와 같이 출력되도록 `저장소` 클래스를 만들어보세요.[정답]

public class Main26_3 {
    public static void main(String[] args) {
        저장소 a저장소 = new 저장소();

        a저장소.저장(15);
        int 결과 = a저장소.주세요();

        System.out.println(결과);
        // 출력 : 10
    }

    static class 저장소 {
        int data;

        void 저장(int input) {
            this.data = input;
        }

        int 주세요() {
            return data;
        }
    }
}