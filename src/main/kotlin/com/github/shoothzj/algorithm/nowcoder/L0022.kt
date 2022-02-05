package com.github.shoothzj.algorithm.nowcoder

class L0022 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param A int整型一维数组
     * @param m int整型
     * @param B int整型一维数组
     * @param n int整型
     * @return 无
     */
    fun merge(A: IntArray, m: Int, B: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1
        var p = m + n - 1
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[p] = A[i]
                p -= 1
                i -= 1
            } else {
                A[p] = B[j]
                p -= 1
                j -= 1
            }
        }
        while (j >= 0) {
            A[p] = B[j]
            p -= 1
            j -= 1
        }
    }

}