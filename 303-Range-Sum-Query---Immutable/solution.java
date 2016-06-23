// You may assume that the array does not change.
// There are many calls to sumRange function. so for loop only needs once
public class NumArray {
    int[] num;
    public NumArray(int[] nums) {
        for(int i = 1; i< nums.length; i++){
            nums[i] += nums[i-1]; 
        }
        this.num = nums;
    }

    public int sumRange(int i, int j) {
       if (i == 0)  return num[j];
        return num[j] - num[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);