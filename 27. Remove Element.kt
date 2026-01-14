class Solution {
    fun removeElement(nums: IntArray, valToRemove: Int): Int {
        var k = 0

        for (i in nums.indices) {
            if (nums[i] != valToRemove) {
                nums[k] = nums[i]
                k++
            }
        }

        return k
    }
}
