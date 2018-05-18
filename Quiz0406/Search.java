package Quiz0406;

public class Search {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 10, 12, 15};
        System.out.println(binarySearch(arr, 10));
    }

    public static int binarySearch (int[] arr, int target) {
        int lower = 0;
        int high = arr.length - 1;

        while (lower <= high) {
            int mid = (lower + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                lower = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

}
