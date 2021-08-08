package com.github.shoothzj.algorithm.leetcode

import org.testng.Assert
import org.testng.annotations.Test

class L1933Test {

    val l1933 = L1933()

    @Test
    fun case1() {
        val result = l1933.isDecomposable("00011111222")
        Assert.assertTrue(result)
    }

    @Test
    fun case2() {
        val result = l1933.isDecomposable("000111000")
        Assert.assertFalse(result)
    }
}