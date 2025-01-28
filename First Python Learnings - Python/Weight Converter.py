weight = float(input("Enter your weight: "))
unit = input("L(bs) or K(g): ")
if unit.casefold() == "L" or unit.casefold() == "l":
    converted = weight * 0.45
    print(f"You are {converted} kilos")
elif unit.casefold() == "K" or unit.casefold() == "k":
    converted = weight / 0.45
    print(f"You are {converted} pounds")
else:
    print("Invalid input")
