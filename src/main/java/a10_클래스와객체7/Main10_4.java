package a10_클래스와객체7;

// 문제 : 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣는 코드를 작성해주세요.

public class Main10_4 {
        public static void main(String[] args) {
            int i = 10;
            double d = i; // 여기선 자동형변환 허용, 왜냐? 안전하니까
            i = (int)d; // 여기선 자동형변환 불가능, 왜냐? 문제가 발생할 가능성이 있으니까.

            System.out.println(i);
        }
    }


