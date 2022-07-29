package a29_StringClass;

public class Explanation29_2 {
    public static void main(String[] args) {
        System.out.println("별 100개 짜리 문장을 만드는 끔찍한 방법");
        String s = "";

        for ( int i = 0; i < 100; i++ ) {
            s += "*";
        }

        System.out.println(s); // 이 문장을 만들기 위해 중간에 사용하지도 않을 문장 100개가 만들어집니다.

        System.out.println("별 100개 짜리 문장을 만드는 좋은 방법");
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < 100; i++ ) {
            sb.append("*");
        }

        s = sb.toString();
        System.out.println(s);

        System.out.println("문장은 공공재 입니다. 즉 공유자원이기 때문에, 새로 만들 순 있어도, 기존의 것을 변경하면 안됩니다.");

        String s1 = "안녕";
        String s2 = "안녕";
        String s3 = "안녕";
        // 현재 s1, s2, s3는 같은 녀석을 가리킵니다.

        // 아래 코드는 s3가 자신이 가리키고 있는 객체를 변경한게 아니라. 새 문장을 만들고 그것을 바라봅니다.(다시 말해 새 객체의 리모콘을 가지게 됩니다.)
        s3 += "하세요.";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
