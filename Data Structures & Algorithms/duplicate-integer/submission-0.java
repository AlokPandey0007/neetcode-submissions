class Solution {
    public boolean hasDuplicate(int[] nums) {
          int n=nums.length;
        HashSet<Integer> hashSet=new HashSet<>();

        for (int i=0;i<n;i++)
        {
            hashSet.add(nums[i]);
        }
        if(hashSet.size()!=n)
        {
            return true;
        }
        return  false;
    }
}