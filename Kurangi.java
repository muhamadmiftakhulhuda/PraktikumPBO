package transpose;

public class Kurangi {
    public static int[][] kurangi(int[][] pertama, int[][] kedua) {
        int baris = pertama.length, kolom = pertama[0].length;
        int[][] selisih = new int[baris][kolom];

        System.out.println("\nHasil Selisih Matriks:\n");
        for (int b = 0; b < baris; b++)
            for (int k = 0; k < kolom; k++)
                selisih[b][k] = pertama[b][k] - kedua[b][k];

        Print2dArray.cetak2dArray(selisih);
        return selisih;
    }
}
