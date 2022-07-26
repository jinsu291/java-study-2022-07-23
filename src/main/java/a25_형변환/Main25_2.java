package a25_형변환;

// 문제 : double 형 변수 d 에 담긴 10.5 를 flaot 형 변수 f에 넣어주세요. 그 반대작업도 진행해주세요.[정답]

public class Main25_2 {
    public static void main(String[] args) {
        double d = 10.5;
        float f;

        f = (float) d;
        d = (double) f;
        d = f;   //이 작업은 안전하기 때문에 그냥 진행해도 됩니다.

    }
}
