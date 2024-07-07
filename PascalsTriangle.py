from math import factorial 
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result_arr = []

        for i in range(numRows):
            temp = []
            for j in range(i+1):
                element = (math.factorial(i))//((math.factorial(i-j))*(math.factorial(j)))
                temp.append(element)

            result_arr.append(temp)
        return result_arr
                