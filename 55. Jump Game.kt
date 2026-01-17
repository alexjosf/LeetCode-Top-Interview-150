class Solution {
    fun canJump(nums: IntArray): Boolean {
        var maxx = 0

        for (i in nums.indices) {
            if (i > maxx) return false
            maxx = maxOf(maxx, i + nums[i])
        }

        return true
    }
}
