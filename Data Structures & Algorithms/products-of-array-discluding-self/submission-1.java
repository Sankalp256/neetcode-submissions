class Solution {
    // public int[] productExceptSelf(int[] nums) {
    //   int n = nums.length;
    //   int[] res = new int[n];
    //   int[] prev = new int[n];
    //   int[] suff = new int[n];

    //   prev[0]=1;
    //   suff[n-1]=1;
    //   for(int i = 1; i < prev.length;i++)
    //   {
    //     prev[i] = nums[i-1] * prev[i-1];
    //   }

    //   for(int i =n-2;i>=0;i--)
    //   {
    //     suff[i] = suff[i+1] * nums[i+1];
    //   }
        
    //     for(int i =0 ;i < n;i++)
    //     {
    //       res[i] = prev[i]*suff[i];
    //     }
      
    //   return res;
    // }

    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] res = new int[n];

      res[0]=1;
      for(int i = 1; i < res.length;i++)
      {
        res[i] = nums[i-1] * res[i-1];
      }

      int postfix=1;
      for(int i= n-1;i >=0;i--)
      {
        res[i] = res[i]* postfix;
        postfix = postfix*nums[i];
      }
        
      
      return res;
    }
}  
