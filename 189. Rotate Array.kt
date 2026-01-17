class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        if (n == 0) return

        val steps = k % n
        reverse(nums, 0, n - 1)
        reverse(nums, 0, steps - 1)
        reverse(nums, steps, n - 1)
    }

    private fun reverse(nums: IntArray, start: Int, end: Int) {
        var l = start
        var r = end
        while (l < r) {
            val temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
            l++
            r--
        }
    }
}
