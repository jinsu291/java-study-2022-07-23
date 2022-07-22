package a06_클래스와객체3;

// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.

public class Main6_8 {
        /// 메인 함수
        public static void main (String[]args){
            new 자동차().달리다();
            new 자동차().달리다();

            사람 a사람 = new 사람();
            a사람.달리다();
            a사람.달리다();

            new 개구리().뛰다();
            new 개구리().뛰다();

            사슴 a사슴;
            a사슴 = new 사슴();
            a사슴.달리다();
            a사슴.달리다();

            new 닭().울다();
        }

        static class 자동차 {
            void 달리다() {
                System.out.println("자동차가 달립니다.");
            }
        }
        static class 사람{
            void 달리다() {
                System.out.println("사람이 달립니다.");
            }
        }
    static class 개구리{
        void 뛰다() {
            System.out.println("개구리가 뜁니다");
        }
    }
    static class 사슴{
        void 달리다() {
            System.out.println("사슴이 달립니다.");
        }
    }

    static class 닭{
        void 울다() {
            System.out.println("닭이 웁니다.");
        }
    }
    }