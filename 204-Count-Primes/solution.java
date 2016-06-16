public class Solution {
public int countPrimes(int n) {
    if( n <=2) {
        return 0;
    }

    int c= 1;
    boolean isNotPrime[] = new boolean[n+1];

    for(int i=3;i*i<=n;i=i+2) {// 排除偶数

        if(isNotPrime[i]) {

            continue;
        }

        for(int j= i*i ;j<=n;j=j+2*i) {
            isNotPrime[j] = true;
        } 

    }

    for(int i =3;i<n;i=i+2){


        if(!isNotPrime[i]) {
            c++;
        }
    }
    return c;

}
}




// public class Solution {
//     public int countPrimes(int n) {
//         boolean notPrime[] = new boolean[n+2];
//         notPrime[0] = notPrime[1] = true;
//         for (int i = 2; i*i < n; i++){
//             if (!notPrime[i]){
//             int c = i * i;
//             while (c < n){
//                 notPrime[c] = true;
//                 c += i;
//                 }
//             }
//         }
//         int ans = 0;
//         for (int i = 0; i < n; i++){
//             if (!notPrime[i]){
//                 ans++;
//             }
//         }
//         return ans;
//     }
// }