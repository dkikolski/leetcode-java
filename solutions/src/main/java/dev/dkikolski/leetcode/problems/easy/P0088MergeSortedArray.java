package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

@Easy
class P0088MergeSortedArray {
    static void merge(int[] a, int m, int[] b, int n) {
        var i = m - 1;
        var j = n - 1;
        var k = m + n - 1; // put elements from the end
        while (i >=0 && j >= 0) {
            if (a[i] > b[j]) {
                a[k] = a[i];
                i--;
            } else {
                a[k] = b[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            a[k] = a[j];
            k--;
            j--;
        }
    }
}
