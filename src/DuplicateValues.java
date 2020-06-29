public class DuplicateValues {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 6, 2, 7, 8, 6, 8, 9};
        System.out.println("Duplicate value is :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
        }
    }
}