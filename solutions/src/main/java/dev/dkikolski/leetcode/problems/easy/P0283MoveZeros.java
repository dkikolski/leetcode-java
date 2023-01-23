package dev.dkikolski.leetcode.problems.easy;

public class P0283MoveZeros {
    public static void moveZeroes(int[] nums) {
        int movedZeros = 0;
        for (int i = 0; i < nums.length - movedZeros; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    swap(nums, j ,j+1);
                }
                movedZeros += 1;
            }
            if (nums[i] == 0) {
                i--;
            }
        }
    }

    private static void swap(final int[] nums, final int i, final int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
