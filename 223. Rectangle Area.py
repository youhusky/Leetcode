'''
Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

Rectangle Area
Assume that the total area is never beyond the maximum possible value of int.
'''
class Solution(object):
    def computeArea(self, A, B, C, D, E, F, G, H):
        """
        :type A: int
        :type B: int
        :type C: int
        :type D: int
        :type E: int
        :type F: int
        :type G: int
        :type H: int
        :rtype: int
        """
        area1 = (C-A) * (D-B)
        area2 = (G - E) * (H- F)
        
        length = max(0, min(C, G) - max(A,E))
        width = max(0, min(D, H) - max(B, F))
        return area1 + area2 - length*width
        