public class InsertionSort {
    public static void sort(int[] in) {
        for (int i = 1; i < in.length; i++) {
            int key = in[i];
            int j = i - 1;
            while (j >= 0 && in[j] > key) {
                in[j + 1] = in[j];
                j--;
            }
            in[j + 1] = key;
        }
    }
}
