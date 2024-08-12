package transpose;

public class Print2dArray {
    public static void cetak2dArray(int[][] matrix) {
        for (int[] baris : matrix) {
            for (int nilai : baris) {
                System.out.print(nilai + "\t");
            }
            System.out.println();
        }
    }

    public static void cetak2dArray(double[][] matrix) {
        for (double[] baris : matrix) {
            for (double nilai : baris) {
                System.out.print(nilai + "\t");
            }
            System.out.println();
        }
    }
}
