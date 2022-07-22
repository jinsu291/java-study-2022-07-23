package a02_조건문;

// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.

public class Explanation2_3 {
    public static void main(String[] args) {
        int age;

        age = 555;

        if ( age > 19 && age < 60 ) {
            System.out.println("미할인");
        }

        // 장동건은 잘 생겼고, 여자이다. => x
        // 장동건은 잘생겼거나, 여자이다. => o
        // 장동건은 못생겼거나, 여자이다. => x

        if ( age <= 19 || age >= 60 ) {
            System.out.println("할인");
        }

        //System.out.println("할인");
    }
}