class Solution {
    fun majorityElement(nums: IntArray): Int {
        var num = 0
        var count = 0

        for (i in nums) {
            if (count == 0) {
                num = i
            }

            if (i == num) {
                count++
            } else {
                count--
            }
        }

        return numa
    }
}
