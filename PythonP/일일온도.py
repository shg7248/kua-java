'''
Created on 2022. 5. 17.

@author: admin
'''

from typing import List

T = [73, 74, 75, 71, 69, 72, 76, 73]
#    0   1   2   3   4   5   6   7

# [1, 1, 4, 2, 1, 1, 0, 0]

def dailyTemperatures(T: List[int]) -> List[int]:
    answer = [0] * len(T)
    stack = []
    
    for i, v in enumerate(T):
        if(stack):
            if(v > T[stack[-1]]):
                last = stack.pop()
                answer[last] = i - last
        stack.append(i)
    return answer;

    
    
    
    
result = dailyTemperatures(T)
print(result)