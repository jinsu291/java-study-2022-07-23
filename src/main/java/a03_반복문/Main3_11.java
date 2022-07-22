package a03_반복문;

// -100부터 25까지의 합을 더한 결과를 출력해주세요.

public class Main3_11 {

    public static void main(String[] args) {
      int sum = 0;
      int start = -100;
      int end = 25;

      int i = start;

      while(i <= end){
          sum += i;
          i++;
      }
        System.out.println("sum : " + sum);
    }
}

