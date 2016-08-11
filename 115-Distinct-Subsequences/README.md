动态规划题。先用二维动态规划的思路解释下：设match是动态规划表，其中match[i][j]表示S.substring(0, i)对T.substring(0, j)有几种组成方式，递推公式为：

若S.charAt(i - 1) == T.charAt(j - )，则match[[i][j] = match[i - 1][j - 1] + match[i - 1][j]。
若S.charAt(i - 1) != T.charAt(j - 1)，则match[i][j] = match[i - 1][j]。