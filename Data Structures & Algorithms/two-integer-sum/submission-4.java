class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> oddMap = new HashMap<>();
        Map<Integer, Integer> evenMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
       
            Map<Integer, Integer> bucket = ((need & 1) != 0) ? oddMap : evenMap;
            if (bucket.containsKey(need)) {
                return new int[]{ bucket.get(need), i };
            }
        
            if ((nums[i] & 1) != 0) oddMap.put(nums[i], i);
            else evenMap.put(nums[i], i);
        }
        return new int[]{};
    }
}