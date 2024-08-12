package transpose;

public class Bagi {
    public static double[][] bagi(int[][] pertama, int[][] kedua) {
        int baris = pertama.length, kolom = pertama[0].length;
        double[][] hasilBagi = new double[baris][kolom];

        System.out.println("\nHasil Bagi Matriks:\n");
        for (int b = 0; b < baris; b++)
            for (int k = 0; k < kolom; k++)
                hasilBagi[b][k] = (double) pertama[b][k] / kedua[b][k];

        Print2dArray.cetak2dArray(hasilBagi);
        return hasilBagi;
    }
}
