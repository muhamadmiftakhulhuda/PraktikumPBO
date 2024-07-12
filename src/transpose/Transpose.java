package transpose;

public class Transpose {
    public static void transpose(int[][] data) {
        int baris = data.length;
        int kolom = data[0].length;

        System.out.println("Elemen-elemen dari matriks transpose T adalah: ");
        for (int b = 0; b < baris; b++) {
            for (int k = 0; k < kolom; k++) {
                System.out.print(data[k][b] + "\t");
            }
            System.out.println();
        }
    }
}
