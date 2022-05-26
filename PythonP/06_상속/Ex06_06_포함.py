'''
Created on 2022. 5. 26.

@author: admin
'''

class Per:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        
class Stu:
    def __init__(self, name, age, kor, eng, math):
        self.per = Per(name, age)
        self.kor = kor
        self.eng = eng
        self.math = math
        
    def display(self):
        print(self.per.name)
        print(self.per.age)
        print(self.kor)
        print(self.eng)
        print(self.math)
        
s = Stu("kim", 25, 70, 80, 90)
print(s.per.name)
print(s.per.age)
print(s.kor)
print(s.eng)
print(s.math)
print("----------------------")
s.display()