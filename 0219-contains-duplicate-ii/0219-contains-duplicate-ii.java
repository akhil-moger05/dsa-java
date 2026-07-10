import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> lastSeen = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i = i + 1) {

            int currentNumber = nums[i];

            if (lastSeen.containsKey(currentNumber)) {

                int lastIndex = lastSeen.get(currentNumber);

                
                if (Math.abs(i - lastIndex) <= k) {
                    return true;   
                }
            }
            lastSeen.put(currentNumber, i);
        }
        return false;
    }
}