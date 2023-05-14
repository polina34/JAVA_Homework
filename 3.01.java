import java.util.Arrays;
class MergeSort {
    
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
    }
    
    private static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid, temp);
        mergeSort(arr, mid + 1, right, temp);
        merge(arr, left, mid, right, temp);
    }
    
    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}