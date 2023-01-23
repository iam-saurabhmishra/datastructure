package practice.Array.demo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11};
        System.out.println(search(arr,5));

    }

    public static int search(int[] nums, int target) {

        int max = nums.length - 1;
        int min = 0;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

}
