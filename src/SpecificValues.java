import java.util.stream.IntStream;

public class SpecificValues {
    public static void main(String[] args) {
        int num[] = {11, 22, 33, 44, 55, 66, 77, 88, 99, 10};
        int toFind = 11;
        boolean found = false;
        for (int n : num){
            if (n == toFind){
                found = true;
                break;
            }
            if (found)
                System.out.println(toFind + "is found in array");
            else
                System.out.println(toFind + "is not found");
        }

        }

    }