class shape:
    def __init__(self,color,is_filled):
        self.color = color
        self.is_filled = is_filled

    def describe(self):
        print("The superclass doesn't have elements to calculate area or I would've done it")

class circle(shape):
    def __init__(self,color,is_filled,radius):
        super().__init__(color,is_filled)
        self.radius = radius

class square(shape):
    def __init__(self,color,is_filled,width):
        super().__init__(color,is_filled)
        self.width = width

class triangle(shape):
    def __init__(self,color,is_filled,width,height):
        super().__init__(color,is_filled)
        self.width = width
        self.height = height

circle1 = circle("blue",True,10)
print(f"circle1 is {circle1.color} and it's {circle1.is_filled} that it's filled and it's radius is {circle1.radius}")
circle1.describe()
print("")

square1 = square("pink",False,10)
print(f"square1 is {square1.color} and it's {square1.is_filled} that it's filled and it's width is {square1.width}")
square1.describe()
print("")

triangle1 = triangle("gray",False,10,5)
print(f"triangle1 is {triangle1.color} and it's {triangle1.is_filled} that it's filled and it's width is {triangle1.width} and it's height is {triangle1.height}")
triangle1.describe()
print("")