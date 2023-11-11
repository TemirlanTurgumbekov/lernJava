import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Бинарный поиск
        int[] numbers = {5, 1, 7, 3, 2};

        System.out.println(binarySearch(numbers, 5));
    }

    public static int binarySearch(int[] nums, int target) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int item = nums[mid];

            if (item == target) {
                return mid;
            } else if (item > target) {
                high = --mid;
            } else {
                low = ++mid;
            }
        }

        return -1;
    }

}