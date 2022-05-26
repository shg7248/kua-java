'''
Created on 2022. 5. 26.

@author: admin
'''

class Product:
    def __init__(self, code, company):
        self.__code = code
        self.__company = company
        
    def show(self):
        print("code : {}".format(self.__code))
        print("company : {}".format(self.__company))
        
    @property
    def code(self):
        return self.__code
    
    @property
    def company(self):
        return self.__company
        
class Computer(Product):
    def __init__(self, code, company, os, ram):
        Product.__init__(self, code, company)
        self.__os = os
        self.__ram = ram
        
    def show(self):
        Product.show(self)
        print("os : {}".format(self.__os))
        print("ram : {}".format(self.__ram))
        
class Book(Product):
    def __init__(self, code, company, title, author):
        super().__init__(code, company)
        self.__title = title
        self.__author = author
    
    @property
    def title(self):
        return self.__title
    
    @property
    def author(self):
        return self.__author
    

p = Product("P01", "제조사")
p.show()

print()

c = Computer("C02", "삼성", "window10", 64)
c.show()

print()

b = Book("B03", "중앙출판사", "자바", "이무진")
print("code : {}".format(b.code))
print("company : {}".format(b.company))
print("title : {}".format(b.title))
print("author : {}".format(b.author))