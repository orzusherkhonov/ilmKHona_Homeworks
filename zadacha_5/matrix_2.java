public class matrix_2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {20, 21, 22, 23, 24}
        };

        for (int i = 0; i < arr.length; i++)
        {

            System.out.print(arr[0][i] + "\t");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++)
        {

            System.out.print(arr[4][i] + "\t");
        }
    }
}