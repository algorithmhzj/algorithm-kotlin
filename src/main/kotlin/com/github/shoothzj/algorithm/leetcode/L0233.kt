package com.github.shoothzj.algorithm.leetcode

import kotlin.math.max
import kotlin.math.min

class L0233 {

    fun countDigitOne(n: Int): Int {
        var countr = 0L
        var aux = 1L
        while (aux <= n) {
            val divider = aux * 10
            // one's place 1 11 21 31 41 51 (n/10) + (n%10!=0)
            countr += (n / divider) * aux + min(max(n.toLong() % divider - aux + 1L, 0L), aux);
            aux = divider
        }
        return countr.toInt()
    }

}