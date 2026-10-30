class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:

        self.maxHeap = stones
        heapq.heapify_max(stones)

        while len(stones) >1:
            first = heapq.heappop_max(stones)
            second = heapq.heappop_max(stones)
            heapq.heappush_max(stones,first - second)

        stones.append(0)

        return abs(stones[0])


        