temp = float(input("Enter tempereture: "))
unit = input("C(celcius) or F(fahrenheight): ")
if unit.casefold() == "C" or unit.casefold() == "c":
    converted = (temp * 9/5) + 32
    print(f"{temp} is {converted} degree in fahrenheight")
elif unit.casefold() == "F" or unit.casefold() == "f":
    converted = (temp - 32) * 5/9
    print(f"{temp} is {converted} degree in celcius")
else:
    print("Invalid input")
