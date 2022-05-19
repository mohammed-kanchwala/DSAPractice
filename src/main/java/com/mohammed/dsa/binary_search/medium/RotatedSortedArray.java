package com.mohammed.dsa.binary_search.medium;

public class RotatedSortedArray {

    static int findPivotPosition(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) return mid;
            if (nums[l] <= nums[mid]) {
                // left sorted array
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                // right sorted array
                if (target < nums[mid] || target > nums[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }

    static int findMinimum(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int result = nums[0];

        while (l <= r) {
            if (nums[l] < nums[r]) {
                result = Math.min(result, nums[l]);
                break;
            }
            int m = (l + r) / 2;
            result = Math.min(result, nums[m]);
            if (nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findPivotPosition(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(findMinimum(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }
}
