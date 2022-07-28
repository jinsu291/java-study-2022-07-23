package a26_형변환2;

// 문제 : 저장소를 만들고 i의 값을 저장한 후 다시 받아보세요.[정답]

public class Main26_2 {
    public static void main(String[] args) {
        int i = 10;

        // 구현 시작
        저장소 a저장소 = new 저장소();

        // 수동박싱 버전
        Integer iObj = new Integer(i); // 수동박식, 하는이유 : 저장 메서드가 객체만 받기 때문에
        a저장소.저장(iObj);
        Object iObj2 = a저장소.주세요();
        iObj = (Integer) iObj2; // 여기서의 수동형변환은 필수이다. 왜 필수인지 아셔야 합니다.
        i = iObj.intValue(); // 수동언박싱

        // 오토박싱 버전, 오토박싱은 다음에 설명드리겠습니다. 지금 일단은 이런게 있다는 것만 알고 넘어가시면 됩니다.
        a저장소.저장(i); // i 가 자동으로 Integer 객체화 되고, 그 객체의 리모콘이 다시 Object 리모콘화 된다.
        i = (int) iObj2; // Object 리모콘이 Integer 리모콘으로 바뀌고 또 그게 일반 int 값으로 자동으로 바뀐다.(오토언박싱)
        // 구현 끝

        System.out.println(i);
        // 출력 : 10
    }

    static class 저장소 {
        Object data;

        void 저장(Object o) {
            data = o;
        }

        Object 주세요() {
            return data;
        }
    }
}
