public class Solution {
    public double findKth(int A[], int a, int B[], int b, int k) {
        if (A.length == a || (b < B.length && A[a] > B[b])) {
            int tmp[] = A;
            A = B;
            B = tmp;
            int t = a;
            a = b;
            b = t;
        }
        if (k == 1) return A[a];
        return findKth(A, ++a, B, b, --k);
    }
    public double findMedianSortedArrays(int A[], int B[]) {
        int len = A.length + B.length;
        if (len == 1) return A.length == 0 ? B[0] : A[0];
        if (len % 2 == 0) {
            return (findKth(A, 0, B, 0, len / 2) + findKth(A, 0, B, 0, len / 2 + 1)) / 2;
        }
        else {
            return findKth(A, 0, B, 0, len / 2 + 1);
        }
    }
}