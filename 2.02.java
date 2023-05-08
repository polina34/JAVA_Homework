import java.io.FileWriter;
import java.io.IOException;

 class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        bubbleSort(arr);
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        try {
            FileWriter writer = new FileWriter("log.txt");
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                    }
                }
                writer.write("Iteration " + (i+1) + ": ");
                for (int k = 0; k < n; k++) {
                    writer.write(arr[k] + " ");
                }
                writer.write("\n");
                if (!swapped) {
                    break;
                }
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}