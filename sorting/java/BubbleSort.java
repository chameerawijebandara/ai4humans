public class BubbleSort {
    public static void sort(int[] in) {
        for (int i = in.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (in[j] > in[j + 1]) {
                    int temp = in[j];
                    in[j] = in[j + 1];
                    in[j + 1] = temp;
                }
            }
        }
    }
}