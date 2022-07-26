package a19_생성자오버로딩_생성자연쇄호출;

// 문제 : 아래와 같이 출력되도록 해보세요.[정답]

public class Main19_1 {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 태어났습니다.

        new 사람(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }

    static class 사람 {
        int 나이;

        사람() {
            System.out.println("사람이 태어났습니다.");
        }

        // 똑같은 이름의 메서드가 클래스 내에 여러개 존재하는 것 : 메서드 오버로딩
        사람(int 나이) {
            this.나이 = 나이;
            System.out.println("태어나서부터 " + 나이 + "살인 사람이 태어났습니다.");
        }
    }
}