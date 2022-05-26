'''
Created on 2022. 5. 26.

@author: admin
'''

class Parent:
    x = 10    
    def method(self):
        print(self)
        print(f"P_x : {self.x}")
        
class Child(Parent):
    x = 20    
    def method(self):
        x = 30
        print(f"x : {x}")
        print(f"self.x : {self.x}")
        print(f"super().x : {super().x}")
        super().method()
        
c = Child()
c.method()