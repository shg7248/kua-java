'''
Created on 2022. 5. 19.

@author: admin
'''

from collections import deque

# 보통 큐(queue)는 선입선출(FIFO)방식으로 작동한다. 반면, 양방향 큐가 있는데 그것이 바로 데크(deque)다.
# 앞, 뒤 양쪽 방향에서 엘리먼트(element)를 추가하거나 제거할 수 있다.
# 데크는 약 끝 엘리먼트의 append와 pop이 압도적으로 빠르다.

qu = deque()
qu.append(1)
qu.append(1)
qu.append(2)
qu.append(3)
print(qu[-1])

class MyQueue:
    def __init__(self):
        self.input = []
        self.output = []
        
    def push(self, x):
        self.input.append(x)
        
    def pop(self):
        self.peek()
        return self.output.pop()
    
    def peek(self):
        if not self.output:
            while self.input:
                self.output.append(self.input.pop())
                
        return self.output[-1]
    
    def empty(self):
        return self.iinput == [] and self.output == []