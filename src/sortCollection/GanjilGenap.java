package sortCollection;

public class GanjilGenap {
    int[] Gage(int[] arr) {
        System.out.println("Bilangan Genap: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nBilangan Ganjil: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    return arr;

    }
}