package a18_생성자2;

// 문제 : 아래와 같이 출력 되도록 해보세요. 단 변수 선언시에 하는 초기화는 불가능합니다.[정답]

public class Main18_2 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        System.out.println(a사람.나이);
        // 출력 : 20
    }

    static class 사람 {
        int 나이;

        사람() {
            this.나이 = 20;
        }
    }
}