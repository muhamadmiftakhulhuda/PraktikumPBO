package sortCollection;

public class FindThePlingSmall {
    int[] findsmall(int[] arr) {
        int i;

        // Initialize minimun element
        int min = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return new int[]{min};
    }
}
