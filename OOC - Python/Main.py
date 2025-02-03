from Classes import car

car1 = car("a",2000,"black",False)

print(car1)
print(car1.color)
print(car1.year)

car2 = car("b",1990,"red",True)

print(car2)
print(car2.color)
print(car2.year)

car2.stop()
car1.drive()