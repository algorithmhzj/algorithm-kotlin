package com.github.shoothzj.algorithm.leetcode

class L0280 {

    fun wiggleSort(nums: IntArray): IntArray {
        var less = true
        for (i in 0 until nums.count() - 1) {
            if (less) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
            less = !less;
        }
        return nums
    }

    fun swap(nums: IntArray, index1: Int, index2: Int) {
        val swap = nums[index1]
        nums[index1] = nums[index2]
        nums[index2] = swap
    }

}