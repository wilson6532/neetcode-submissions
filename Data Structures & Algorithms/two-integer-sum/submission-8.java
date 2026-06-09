class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) != 0)
                odd.add(i);
            else
                even.add(i);
        }

        if ((target & 1) != 0) {
            for (int oi : odd) {
                for (int ei : even) {
                    if (nums[oi] + nums[ei] == target) {
                        return oi < ei ? new int[] {oi, ei} : new int[] {ei, oi};
                    }
                }
            }
        } else {
            int[] res = searchWithin(nums, target, odd);
            if (res != null)
                return res;
            res = searchWithin(nums, target, even);
            if (res != null)
                return res;
        }
        return new int[] {};
    }

    private int[] searchWithin(int[] nums, int target, List<Integer> bucket) {
        for (int a = 0; a < bucket.size(); a++) {
            for (int b = a + 1; b < bucket.size(); b++) {
                int i = bucket.get(a), j = bucket.get(b);
                if (nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        return null;
    }
}