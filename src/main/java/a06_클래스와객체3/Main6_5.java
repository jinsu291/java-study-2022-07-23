package a06_클래스와객체3;

// 문제 : 아래 코드가 실행되도록 해주세요.

public class Main6_5 {
        /// 메인 함수
        public static void main (String[]args){

            거북이 a거북이 = new 거북이();

            a거북이.걷다();
            a거북이.수영하다();
        }

        static class 거북이 {
            void 걷다() {
                System.out.println("걷다");
            }
            void 수영하다() {
                System.out.println("수영하다");
            }
        }
    }