package transpose;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Silakan masukkan jumlah baris dalam matriks");
        Scanner sc = new Scanner(System.in);
        int baris = sc.nextInt();
        System.out.println("Silakan masukkan jumlah kolom dalam matriks");
        int kolom = sc.nextInt();

        int[][] pertama = new int[baris][kolom];
        int[][] kedua = new int[baris][kolom];

        for (int b = 0; b < baris; b++) {
            for (int k = 0; k < kolom; k++) {
                System.out.println(String.format("Masukkan bilangan bulat pertama[%d][%d]", b, k));
                pertama[b][k] = sc.nextInt();
            }
        }

        for (int b = 0; b < baris; b++) {
            for (int k = 0; k < kolom; k++) {
                System.out.println(String.format("Masukkan bilangan bulat kedua[%d][%d]", b, k));
                kedua[b][k] = sc.nextInt();
            }
        }

        // tutup scanner
        sc.close();

        // cetak kedua matriks
        System.out.println("Matriks Pertama:\n");
        Print2dArray.cetak2dArray(pertama);

        System.out.println("Matriks Kedua:\n");
        Print2dArray.cetak2dArray(kedua);

        // jumlah dan transpose matriks
        Transpose.transpose(Sum.sum(pertama, kedua));

        // pengurangan matriks
        Kurangi.kurangi(pertama, kedua);

        // pembagian matriks
        Bagi.bagi(pertama, kedua);

        // perkalian matriks
        Kali.kali(pertama, kedua);

        // memutar matriks kembali ke bentuk asli setelah transpose
        PutarKembali.putarKembali(pertama); // mengasumsikan kita perlu memutar kembali matriks pertama
    }
}
