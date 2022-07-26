package a12_구성2.a18_생성자2;

// 문제 : 아래와 같이 출력 되도록 해보세요. 단 변수 선언시에 하는 초기화는 불가능합니다.[정답]
public class Main18_3 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        System.out.println(a사람.나이);
        // 출력 : 20
        System.out.println(a사람.이름);
        // 출력 : 홍길동
        System.out.println(a사람.고향);
        // 출력 : 한양
        System.out.println(a사람.성격);
        // 출력 : 착함
    }

    static class 사람 {
        int 나이;
        String 이름;
        String 고향;
        String 성격;

        사람() {
            this.나이 = 20;
            this.이름 = "홍길동";
            this.고향 = "한양";
            this.성격 = "착함";
        }
    }
}