class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int res = 0;

        while (l < r) {
            int area = Math.min(heights[l], heights[r]) * (r - l); //找最矮柱子跟他的最遠柱子距離乘積
            res = Math.max(res, area); //取上述註解的條件中的最大者
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}