package Week_1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] == target) {
                return mid;
            } 
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

// -1, 0, 3, 5, 9, 12
// start = 0, end = 5
// start is less than end, so mid = 0 + 5/2 = 2
// nums[2] = 3 < 9, so start = 3.
// start is still less than end, so mid = 3 + 2/2 = 4
// nums[4] = 9 == 9, so we return mid as 4.
