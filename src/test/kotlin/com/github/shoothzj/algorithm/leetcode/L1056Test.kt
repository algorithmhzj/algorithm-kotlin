package com.github.shoothzj.algorithm.leetcode

import org.testng.Assert
import org.testng.annotations.Test

class L1056Test {

    val l1056 = L1056()

    @Test
    fun testConfusingNumber() {
        val res = l1056.confusingNumber(6)
        Assert.assertTrue(res)
    }

}