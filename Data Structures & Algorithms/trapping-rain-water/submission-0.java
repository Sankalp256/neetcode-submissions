class Solution {
    public int trap(int[] height) {
        
        int l =0, r = height.length -1, leftMax = height[0], rightMax= height[height.length -1];
        int trap = 0;
        while(l<r)
        {
          if(leftMax < rightMax)
          {
            l++;
            leftMax = Math.max(leftMax,height[l]);
            trap += leftMax - height[l];
          }
          else
          {
            r--;
            rightMax = Math.max(rightMax,height[r]);
            trap += rightMax - height[r];
          }
        }

        return trap;

    }
}
