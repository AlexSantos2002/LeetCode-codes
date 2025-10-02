package SingleNumber;

public class SingleNumber {
public int singleNumber(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n; i++) {
        boolean temPar = false;
        for (int j = 0; j < n; j++) {
            if (i != j && nums[i] == nums[j]) {
                temPar = true;
                break;
            }
        }
        if (temPar == false){
            return nums[i];
        }
    }
    return -1;
}
}
