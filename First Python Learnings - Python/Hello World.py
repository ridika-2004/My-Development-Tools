import sys
import random
print(sys.version)

print("Hello Ridika!")

if "ridika">"adiba":
    print("Ridika is greater than Adiba")

#it's a comment

number = 5.3

print("Today's earthqauke in richter scale was", number, ", Scary right?")

x = memoryview(bytes(5))
print(type(x))

mylist = ["apple", "banana", "cherry", 1, 2, 3, True, False]
print(len(mylist))
print(mylist[3])

x = mylist
x[4] = "orange"
print(x[4])

i = "i "
am = "am "
five = 5
cool = "cool"
print(i+am+cool)
print(i+am,five)

def function():
    print("This is a function")

function()

v = random.randrange(1,20)
print(v)

s = str(v)
print(s)

for x in "ridika":
    print(x)

print('r' in "ridika")

if 'r' in "ridika":
    print("Yes, 'r' is present in the string")
else:
    print("No, 'r' is not present in the string")

b = "Hello, World!  "
print(b[2:5])
print(b[:5])
print(b[2:])
print(b[-5:-2])
print(b.upper())
print(b.strip())
print(b.replace("H", "J"))
print(b.split(","))