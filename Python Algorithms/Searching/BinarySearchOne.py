def binarySearch(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: int
    """
    if len(nums) == 0:
        return -1

    left, right = 0, len(nums) - 1
    while left <= right:
        mid = (left + right) // 2
        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    # End Condition: left > right
    return -1
"""
Info grabbed from leetcode
Most standard Binary Search
Search condition can be determined without comparing to the element's neighbors(or use specific elements
around it)
No post-processing required because at each step, you are checking to see if the element has 
been found. If you reach the end, then you know the element is not found.
Distinguishing Syntax:
Inital Condition: left =0,right=length-1
Termination: left>right
Searching Left: right = mid-1
Searching Right: left = mid+1
"""
