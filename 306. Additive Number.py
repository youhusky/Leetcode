'''
Additive number is a string whose digits can form additive sequence.

A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.

For example:
"112358" is an additive number because the digits can form an additive sequence: 1, 1, 2, 3, 5, 8.

1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
"199100199" is also an additive number, the additive sequence is: 1, 99, 100, 199.
1 + 99 = 100, 99 + 100 = 199
Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.

Given a string containing only digits '0'-'9', write a function to determine if it's an additive number.

Follow up:
How would you handle overflow for very large input integers?
'''
class Solution(object):
    def isAdditiveNumber(self, num):
        """
        :type num: str
        :rtype: bool
        """
        def isValid(num):
            return len(num) == 1 or num[0] != '0'

        def search(a, b, c):
            d = str(int(a) + int(b))
            if not isValid(d) or not c.startswith(d):
                return False
            if c == d:
                return True
            return search(b, d, c[len(d):])

        size = len(num)
        for x in range(1, size / 2 + 1):
            for y in range(x + 1, size):
                a, b, c = num[:x], num[x:y], num[y:]
                if not isValid(a) or not isValid(b):
                    continue
                if search(a, b, c):
                    return True
        return False