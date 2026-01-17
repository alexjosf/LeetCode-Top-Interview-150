class Solution {
   fun jump(nums: IntArray): Int {
    val n = nums.size

    var jumps = 0         
    var farthest = 0      
    var end = 0     

    for (i in 0 until n - 1) {  
        farthest = maxOf(farthest, i + nums[i])

        if (i == end) {   
            jumps++
            end = farthest
        }
    }

    return jumps
}
}