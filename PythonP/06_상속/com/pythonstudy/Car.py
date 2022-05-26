'''
Created on 2022. 5. 26.

@author: admin
'''

class Car:
    def __init__(self, name, len):
        self.name = name
        self.len = len
    
    def prnCar(self):
        print(self.name)
        print(self.len)