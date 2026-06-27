class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> numSet = new HashSet<>();
      int res =0;

      for(int num : nums)
      {
        numSet.add(num);
      }

      for(int num: numSet){

        int length = 0,curr = num;
        while(numSet.contains(curr))
        {
          length++;
          curr++;
        }
        res = Math.max(res,length);
      }

        return res;
    }
}
