package transpose;

public class Kali {
    public static int[][] kali(int[][] pertama, int[][] kedua) {
        int baris = pertama.length, kolom = pertama[0].length;
        int[][] hasilKali = new int[baris][kolom];

        System.out.println("\nHasil Kali Matriks:\n");
        for (int b = 0; b < baris; b++)
            for (int k = 0; k < kolom; k++)
                hasilKali[b][k] = pertama[b][k] * kedua[b][k];

        Print2dArray.cetak2dArray(hasilKali);
        return hasilKali;
    }
}
