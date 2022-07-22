package a06_클래스와객체3;

// 문제 : 아래 코드가 실행되도록 해주세요

public class Main6_7 {
        /// 메인 함수
        public static void main (String[]args){
            // new 자동차() => 리모콘
            new 자동차().달리다();
        }

        static class 자동차 {
            void 달리다() {
                System.out.println("달립니다.");
            }
        }
    }