package a24_static;

public class Main24_2 {
    public static void main(String[] args) {
        String str = "axslekjxxlkzjxkljxxXXXssjxxXXxxX";

        int xCount = 0;

        for ( int i = 0; i < str.length(); i++ ) {
            if ( str.charAt(i) == 'x' || str.charAt(i) == 'X' )
            {
                xCount++;
            }
        }

        System.out.println("xCount : " + xCount);
    }
}
