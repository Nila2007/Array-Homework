import java.util.Arrays;
/*  To check two arrays are equals or not*/
public class Equality {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5, 6,}; // declare two array value
        int a2[] = {1, 6, 3, 4, 5, 6};
        int num = 0;

        if (a1.length == a2.length)    // compare to array to use if else
        {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    num = 1;
                    break;
                }
            }

            if (num == 0) {
                System.out.println("Arrays are Equal");
            } else {
                System.out.println("Arrays are Not Equal");

            }
        }
    }}
