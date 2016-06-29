public class Solution {
    public int bulbSwitch(int n) {
         return (int)Math.sqrt(n);
    }
}
// 很容易的我们可以推断出，如果一个灯泡被切换了偶数次，他最后一定是关闭的。
// 同理，如果一个灯泡被切换了奇数次，他最后一定是开启的。
// 对于第i个灯泡，如果他不是一个完全平方数，那他一定有偶数个因子，也就是说他会被切换偶数次。
// 比如6（1，2，3，6），18（1，2，3，6，9，18）等。
// 如果他是一个完全平方数，则他只有奇数个因子，也就是说他会被切换奇数次。
// 比如9（1，3，9），36（1，6，36）等。
// 即最后开启的灯泡数为n中完全平方数的个数。
// 我们只需要找出n中有多少个完全平方数即可，而不超过n的完全平方数个数等于不超过n的最大完全平方数的平方根。