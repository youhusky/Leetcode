// 101 101  101 110
//用大小为 32的数组来记录所有 位上的和
public class Solution {
    public int singleNumber(int[] nums) {
        int[] bit = new int[32];
        int res = 0;
        for (int i=0; i<32; i++){
            for(int j = 0; j < nums.length; j++){
                if(((nums[j]>>i) & 1 )== 1) //为1 
                    bit[i]++;
            }
            res |= (bit[i]%3) << i; //倒序
        }
        return res;
    }
}