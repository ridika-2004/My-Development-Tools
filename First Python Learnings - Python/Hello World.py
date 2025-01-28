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

txt = f"Hello, {v:.2f}"
print(txt)

line = "we are the \"vikings\" from the north."
print(line)

print(bool(0))

if function:
    print("Yes")

print(isinstance(line, int))
print(isinstance(v, int))

thislist = ["apple", "banana", "cherry"]
thislist.append("orange")
thislist.insert(1, "mango")
print(thislist)

anotherlist = ["kiwi", "grapes"]
thislist.extend(anotherlist)
print(thislist)
thislist.remove("banana")
print(thislist)
thislist.pop(1)
print(thislist)
thislist.pop()
print(thislist)
for x in thislist:
    print(x)
for i in range(len(thislist)):
    print(thislist[i])
i=0;
while i<len(thislist):
    print(thislist[i])
    i += 1 #python doesn't support i++
newlist = []
for x in thislist:
    if "c" in x:
        newlist.append(x)

print(newlist)
thislist.sort()
print(thislist)
thislist.reverse()
print(thislist)

numberlist = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
def myfunc(x):
    return abs(x-5)

numberlist.sort(key=myfunc)
print(numberlist)

anothernumberlist = numberlist.copy()
anothernumberlist = list(numberlist)
anothernumberlist = numberlist[:]

print(anothernumberlist)

biglist = anothernumberlist + thislist
thislist.extend(anothernumberlist)
print(thislist)
print(biglist)