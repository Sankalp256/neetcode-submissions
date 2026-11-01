class Solution:
    # def findKthLargest(self, nums: List[int], k: int) -> int:
    #     minHeap = []

    #     for num in nums:
    #         heapq.heappush(minHeap,num)
    #         if len(minHeap) > k:
    #             heapq.heappop(minHeap)
            
    #     return minHeap[0]
    
    def findKthLargest(self, nums: List[int], k: int) -> int:
        k = len(nums) - k

        def quickSelect(l,r):
            pivot = nums[r]
            p = l

            for i in range(l,r):
                if nums[i] <= pivot:
                    nums[p],nums[i] = nums[i],nums[p]
                    p +=1
            nums[p],nums[r] = nums[r], nums[p]
            if p < k:
                return quickSelect(p + 1,r)
            if p > k:
                return quickSelect(l, p -1)
            if p == k:
                return nums[p]
        
        return quickSelect(0, len(nums)-1)
            
        
        