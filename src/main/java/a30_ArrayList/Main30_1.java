package a30_ArrayList;

// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 오류만 안나게 해주세요.[정답]

public class Main30_1 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
    }

    static class ArrayList {
        void add(int data) {
        }
    }
}