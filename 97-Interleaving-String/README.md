state: dp[i][j] s1取前i个字符 s2取前j个字符 s3取前i+1字符 是否能匹配
function:  如果最后一位(i+j位)与s1的最后一位(i位)相等 dp[i][j] = dp[i-1][j]
与s2最后一位相等则dp[i][j] = dp[i][j-1]
initial: dp[0][0] = true dp[i][0] dp[0][j]看s1 s2 s3比较
返回: dp[s1.length][s2.length]