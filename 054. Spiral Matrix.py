'''
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
'''
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res = []
        try:
            while True:
                res += matrix.pop(0)
                for i in range(len(matrix)):
                    res.append(matrix[i].pop(-1))
                res += reversed(matrix.pop(-1))
                for j in range(len(matrix)):
                    res.append(matrix[len(matrix)-1-j].pop(0))
        except:
            pass
        return res