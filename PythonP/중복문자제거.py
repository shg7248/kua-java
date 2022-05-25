'''
Created on 2022. 5. 17.

@author: admin
'''

import collections

str = "zcbacdcbc"

def removeDuplicateLetters(s: str) -> str:
    # for char in sorted(set(s)):
    #     suffix = s[s.index(char):]
    #     if set(s) == set(suffix):
    #         return char + removeDuplicateLetters(suffix.replace(char, ''))
    #
    # return ''
    counter, seen, stack = collections.Counter(s), set(), []
    for char in s:
        print(char)
            
    
result = removeDuplicateLetters(str)
print(result)

stack = ["a", "b", "c"]
print(stack[-1])
