package a02_조건문;

public class Explanation2_2 {
    public static void main(String[] args) {
        int age;   //실행1
        age = 22;   //실행2

        //System.out.println("당신의 나이는 22살 입니다.");   //실행3

        System.out.println("당신의 나이는" + age + "살 입니다.");   //실행4

        if ( age >= 20 ) { // 구조 만들고 실행 5
            System.out.println("성년입니다."); // 실행 6
        }
        // 실행 7
        if ( age < 20 ) {
            System.out.println("미성년입니다.");
        }
    }
}
