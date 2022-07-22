package a03_반복문;

// 문제 : 1부터 5까지 출력해주세요.

// 출력
// 1
// 2
// 3
// 4
// 5

public class Main3_6 {

    public static void main(String[] args) {
       int start = 1;
       int end = 5;

       int i = start;

       while(i<= end){
           System.out.println(i);
           i++;
       }
    }
}

