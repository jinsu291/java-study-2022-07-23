package a03_반복문;

// 1부터 5까지의 합을 더한 결과를 출력해주세요.

public class Main3_10 {

    public static void main(String[] args) {
      int sum = 0;
      int start = 1;
      int end = 5;

      int i = start;

      while(i <= end){
          sum += i;
          i++;
      }
        System.out.println("sum : " + sum);
    }
}

