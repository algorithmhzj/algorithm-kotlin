package com.github.shoothzj.algorithm.leetcode

class L1056 {

    fun confusingNumber(n: Int): Boolean {
        var aux = 0
        var temp = n
        while (temp != 0) {
            val i = temp % 10
            aux *= 10
            if (i == 1) {
                aux += 1
            } else if (i == 0) {
                aux += 0
            } else if (i == 6) {
                aux += 9
            } else if (i == 8) {
                aux += 8
            } else if (i == 9) {
                aux += 6
            } else {
                return false
            }
            temp /= 10
        }
        return aux != n
    }

}