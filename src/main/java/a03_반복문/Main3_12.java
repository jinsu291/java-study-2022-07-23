package a03_반복문;

// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용

public class Main3_12 {

    public static void main(String[] args) {
        System.out.println("== 정답 v1 ==");

        int i = 0;

        while ( i < 10 ) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);

            i++;
        }

        System.out.println("== 정답 v2 ==");

        i = 0;

        while ( i < 10 ) {
            int j = 1;

            System.out.println(j);
            j++;

            System.out.println(j);
            j++;

            System.out.println(j);
            j++;

            i++;
        }

        System.out.println("== 정답 v3 ==");

        i = 0;

        while ( i < 10 ) {
            // 여기서는 `int j`가 가능합니다.
            int j = 1;

            while ( j <= 3 ) {
                System.out.println(j);
                j++;
            }
            i++;
        }
    }
}