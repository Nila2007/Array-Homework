public class Transpose {
    public static void main(String args[]){
        int arr[][]={{1,3,4},{2,4,3},{3,4,5}};
        //creating another matrix to store transpose of matrix
        int transpose[][] = new int[3][3]; // 3 rows and 3 columns

         // code to transpose a matrix
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        System.out.println("printing matrix without transpose:");
        for (int i=0; i<3; i++){
            for (int j=0;j<3; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("printing matrix after transpose:");
        for (int i=0;i<3; i++){
            for (int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
