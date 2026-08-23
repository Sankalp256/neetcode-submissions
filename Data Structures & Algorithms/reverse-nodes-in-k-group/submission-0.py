# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        temp = head
        count = 0
        while count < k:
            if temp == None:
                return head
            temp = temp.next
            count+=1
        
        prevNode = self.reverseKGroup(temp,k);

        temp = head
        count =0;


        while count < k:
            nxt = temp.next
            temp.next = prevNode
            prevNode = temp
            temp = nxt
            count+=1
        
        return prevNode
        


        