import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        
        HashSet<Integer> seen = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i = i + 1) {

            boolean wasAdded = seen.add(nums[i]);
            if (wasAdded == false) {
                return true;  
            }
        }
        return false;
    }
}