public class Solution {
   int[] original,shuffled;
   Random rnd = new Random();
   public Solution(int[] nums){
      original = nums;
      shuffled = original.clone();
   }
   public int[] shuffle(){
      for (int i=shuffled.length-1; i>=1; i--){
         int tmp = shuffled[i];
         int rand = rnd.nextInt(i+1);
         shuffled[i] = shuffled[rand];
         shuffled[rand] = tmp;
      }
      return shuffled;
   }
   public int[] reset() {
      return original;
   }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */