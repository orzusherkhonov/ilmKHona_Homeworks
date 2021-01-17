public class matrix_5 {
    public static void main(String[] args) {
        int [] arr2 = new int[5];
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {20, 21, 22, 23, 24}
        };

        for (int i = 0; i < arr.length; i++)
        {
            arr2[i] = arr[3][i];
            arr[3][i] = arr[4][i];
            arr[4][i] = arr2[i];
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}