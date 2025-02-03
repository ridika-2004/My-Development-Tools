from abc import ABC, abstractmethod

class shape(ABC):
    @abstractmethod
    def area(self):
        pass

class circle(shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        print(3.14 * self.radius ** 2)

class square(shape):
    def __init__(self, width):
        self.width = width

    def area(self):
        print(self.width ** 2)

class triangle(shape):
    def __init__(self, base, height):
        self.base = base
        self.height = height

    def area(self):
        print(0.5 * self.base * self.height)
    
class pizza(circle):
    def __init__(self, radius, toppings):
        super().__init__(radius)
        self.toppings = toppings

    def area(self):
        super().area()
        print(f"Yummy Pizza with {self.toppings}")

shapes = [circle(10), square(10), triangle(10, 10), pizza(10, "pepperoni")]

for x in shapes:
    x.area()
    print("")