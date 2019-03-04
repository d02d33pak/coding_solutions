class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        d = dict((nums[i], i) for i in range (len(nums)))
        for i in range (len(nums)):
            diff = target - nums[i]
            if diff in d.keys() and d.get(diff) != i:
                 return [i, d.get(diff)]
        
