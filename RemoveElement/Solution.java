package RemoveElement;
import java.util.ArrayList;

class Solution {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newArray.add(nums[i]);
            }
        }

        for (int i = 0; i < newArray.size(); i++) {
            nums[i] = newArray.get(i);
        }

        return newArray.size();
    }
}
