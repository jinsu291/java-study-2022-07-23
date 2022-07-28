package a26_형변환2;

// 문제 : 아래의 진행상활대로 코딩해주세요.[정답]

public class Main26_5 {
    public static void main(String[] args) {
        // Integer에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
        int i = 10;
        System.out.println(i + 20);
        Integer iObj = new Integer(10); // 수동박싱
        int k = iObj.intValue(); // 수동언박싱
        System.out.println(k + 20);
        Integer iObj2 = 30; // 오토박싱
        int i3 = iObj2 + 20 - iObj2 - iObj2; // 오토언박싱
        System.out.println(i3);

        // Boolean에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
        Boolean blObj = new Boolean(false); // 수동박싱
        boolean bl = blObj.booleanValue(); // 수동언박싱
        Boolean blObj2 = false; // 오토박싱
        boolean bl2 = new Boolean(true); // 오토언박싱
        bl2 = blObj2; // 오토언박싱

        // Character에 대해서 수동박싱, 수동언박싱, 오토박싱, 오토언박싱이 일어나도록 해주세요.
    }
}