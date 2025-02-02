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

biglist.pop(1)
print(biglist)
biglist.pop()
print(biglist)

del biglist[0]
print(biglist)

biglist.clear()
print(biglist)
del biglist
# print(biglist) will give error

for x in thislist:
    print(x)

for x in range(len(thislist)):
    print(thislist[x])

mytuple = ("toji","sukuna","nanami","gojo","choso","itadori","megumi")
print(mytuple)
print(mytuple[2:5])

anothertuple = ("nobara","maki","mai")
mixedtuple = list(mytuple)+(list(anothertuple))
print(tuple(mixedtuple))

(a,b,c) = anothertuple
print(a)

(u,v,w,x,y,*z) =mixedtuple
print(z)

# we can iterate through tuple like lists

tuple_1 = mytuple+anothertuple
tuple_2 = anothertuple*2;
print(tuple_1)
print(tuple_2)

myset = {"madara","obito","itachi","sasuke","itachi"}
print(myset)

# duplicates not allowed in set

# true and 1 is considered to be same in set, similar to false and 0

anotherset = set(("luffy","nami","zoro","robin","sanji","ussop","chopper","jinbei","franky"))
print(anotherset)

myset.add("sarada")
print(myset)

# can add one item in add() function.

myset.update(anotherset)
print(myset)

# can update any iterable type within update()

myset.remove("sarada")
print(myset)

# if sarada doesn't exist it will create error

myset.discard("sarada")
print(myset)

# does sme but not create error if sarada doesn't exist

popped_value = myset.pop()
print(myset)
print(popped_value)

# as set unordered, we don't know which item got removed

anotherset.clear()
print(anotherset)

del anotherset
# print(anotherset)

# will create error

# we can iterate through set by loops too

set1 = {"a","b","c"}
set2 = {1,2,3}
set3 = set1.union(set2)
print(set1)
print(set2)
print(set3)

# there's a symbol for union

set3 = set1 | set2
print(set3)

set4 = {"ichi","ni","san"}
set3 = set1.union(set2,set4)
print(set3)

# we can add multiple sets with | too

set3 = set1 | set2 | set4
print(set3)

# but with union() we can join set with another type of iteraive types. but they'll be converted in set

set3 = set1.intersection(set2)
print(set3)

set2.add("ichi")
set3 = set2 & set4
print(set3)

set3 = set2.difference(set4)
print(set3)

set3 = set2 - set4
print(set3)

# same result

set3 = set2.difference_update(set4)
print(set3)

set3 = set1.symmetric_difference(set2)
print(set3)

# we can use ^ too for symmetric_difference

set3 = set1^set2
print(set3)

set3 = set2.symmetric_difference_update(set4)
print(set3)

favchar = {
    "name" : "one piece",
    "favchar" : "robin",
    "gender" : "female",
    "is pretty" : "rial"
}
print(favchar)
print(favchar["favchar"])
print(favchar.get("favchar"))

# dictionary is sued for key-value pair

favchar["color"] = ["blue","pink","black","white"]

print(favchar.keys())
print(favchar.values())
print(favchar.items())

favchar["color"] = "blue"
# changed item

favchar.update({"eyes" : "dark"})
print(favchar)

for x in favchar:
    print(x)

favchar.pop("color")

# to remove last item

favchar.popitem()
print(favchar)

favchar.clear()
del favchar

