package a18_생성자2;

// 문제 : 아래와 같이 출력 되도록 해보세요.[정답]
public class Main18_4 {
    public static void main(String[] args) {
        사람 a사람 = new 사람("홍길순", 22, "함경도", "예민함");
        System.out.println(a사람.나이);
        // 출력 : 22
        System.out.println(a사람.이름);
        // 출력 : 홍길순
        System.out.println(a사람.고향);
        // 출력 : 함경도
        System.out.println(a사람.성격);
        // 출력 : 예민함

        사람 a사람2 = new 사람("임꺽정", 50, "충청도", "호탕함");
        System.out.println(a사람2.나이);
        // 출력 : 50
        System.out.println(a사람2.이름);
        // 출력 : 임꺽정
        System.out.println(a사람2.고향);
        // 출력 : 충청도
        System.out.println(a사람2.성격);
        // 출력 : 호탕함
    }

    static class 사람 {
        int 나이;
        String 이름;
        String 고향;
        String 성격;

        사람(String 이름, int 나이, String 고향, String 성격) {
            // 여기서는 `this.` 을 생략할 수 없다.
            this.나이 = 나이;
            this.이름 = 이름;
            this.고향 = 고향;
            this.성격 = 성격;
        }
    }
}