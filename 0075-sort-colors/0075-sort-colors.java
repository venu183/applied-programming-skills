class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid], then increment both low and mid
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // If the element is 1, it's in its correct place, so just move mid forward
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high], then decrement high
                    // Do not increment mid here, as the swapped element at mid needs to be re-evaluated
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
